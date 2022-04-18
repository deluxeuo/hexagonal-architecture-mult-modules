package br.com.realstate.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.realstate.data.RealStateDto;
import br.com.realstate.entity.RealState;

@Mapper
public interface RealStateMapper {

   RealStateMapper INSTANCE = Mappers.getMapper(RealStateMapper.class);

    RealStateDto realStateToRealStateDto(RealState realState);

    RealState realStateDtoToRealState(RealStateDto realStateDto);

    List<RealStateDto> realStateListToRealStateDtoList(List<RealState> realStateList);

    List<RealState>RealStateDtoListTorealStateList(List<RealStateDto>RealStateDtoList);
}
