package br.com.realstate.ports.spi;

import java.util.List;

import br.com.realstate.data.RealStateDto;

public interface RealStatePersistencePort {

    RealStateDto addRealState(RealStateDto realStateDto);

    void deleteRealStateById(Long id);

    RealStateDto updateRealState(RealStateDto realStateDto);

    List<RealStateDto> getRealStates();

    RealStateDto getRealStateById(Long realStateId);

}
