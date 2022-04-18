package br.com.realstate.service;

import java.util.List;

import br.com.realstate.data.RealStateDto;
import br.com.realstate.ports.api.RealStateServicePort;
import br.com.realstate.ports.spi.RealStatePersistencePort;

public class RealStateServiceImpl implements RealStateServicePort {

    private RealStatePersistencePort realStatePersistencePort;

    public RealStateServiceImpl(RealStatePersistencePort realStatePersistencePort) {
        this.realStatePersistencePort = realStatePersistencePort;
    }

    @Override
    public RealStateDto addRealState(RealStateDto realStateDto) {
        return realStatePersistencePort.addRealState(realStateDto);
    }

    @Override
    public void deleteRealStateById(Long id) {
        realStatePersistencePort.deleteRealStateById(id);
    }

    @Override
    public RealStateDto updateRealState(RealStateDto realStateDto) {
        return realStatePersistencePort.updateRealState(realStateDto);
    }

    @Override
    public List<RealStateDto> getRealStates() {
        return realStatePersistencePort.getRealStates();
    }

    @Override
    public RealStateDto getRealStateById(Long realStateId) {
        return realStatePersistencePort.getRealStateById(realStateId);
    }
}
