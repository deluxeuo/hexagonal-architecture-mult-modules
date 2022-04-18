package br.com.realstate.ports.api;

import java.util.List;

import br.com.realstate.data.RealStateDto;

public interface RealStateServicePort {

    RealStateDto addRealState(RealStateDto realStateDto);

    void deleteRealStateById(Long id);

    RealStateDto updateRealState(RealStateDto realStateDto);

    List<RealStateDto> getRealStates();

    RealStateDto getRealStateById(Long realStateId);
}
