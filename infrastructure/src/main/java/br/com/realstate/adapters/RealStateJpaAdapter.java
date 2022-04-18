package br.com.realstate.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.realstate.data.RealStateDto;
import br.com.realstate.entity.RealState;
import br.com.realstate.mappers.RealStateMapper;
import br.com.realstate.ports.spi.RealStatePersistencePort;
import br.com.realstate.repository.RealStateRepository;

@Service
public class RealStateJpaAdapter implements RealStatePersistencePort {

    @Autowired
    private RealStateRepository realStateRepository;

    @Override
    public RealStateDto addRealState(RealStateDto realStateDto) {

        RealState realState = RealStateMapper.INSTANCE.realStateDtoToRealState(realStateDto);

        RealState realStateSaved = realStateRepository.save(realState);

        return RealStateMapper.INSTANCE.realStateToRealStateDto(realStateSaved);
    }

    @Override
    public void deleteRealStateById(Long id) {
        realStateRepository.deleteById(id);
    }

    @Override
    public RealStateDto updateRealState(RealStateDto realStateDto) {
        return addRealState(realStateDto);
    }

    @Override
    public List<RealStateDto> getRealStates() {

        List<RealState> realStateList = realStateRepository.findAll();

        return RealStateMapper.INSTANCE.realStateListToRealStateDtoList(realStateList);
    }

    @Override
    public RealStateDto getRealStateById(Long realStateId) {

        Optional<RealState> realState = realStateRepository.findById(realStateId);

        if (realState.isPresent()) {
            return RealStateMapper.INSTANCE.realStateToRealStateDto(realState.get());
        }

        return null;
    }
}
