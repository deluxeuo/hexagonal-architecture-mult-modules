package br.com.realstate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.realstate.data.RealStateDto;
import br.com.realstate.ports.api.RealStateServicePort;

@RestController
@RequestMapping("/realstate")
public class RealStateController {

    @Autowired
    private RealStateServicePort realStateServicePort;

    @PostMapping("/add")
    public RealStateDto addRealState(@RequestBody RealStateDto realStateDto) {
        return realStateServicePort.addRealState(realStateDto);
    }

    @PutMapping("/update")
    public RealStateDto updateRealState(@RequestBody RealStateDto realStateDto) {
        return realStateServicePort.updateRealState(realStateDto);
    }

    @GetMapping("/get/{id}")
    public RealStateDto getRealStateByID(@PathVariable long id) {
        return realStateServicePort.getRealStateById(id);
    }

    @GetMapping("/get")
    public List<RealStateDto> getAllRealStates() {
        return realStateServicePort.getRealStates();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRealStateByID(@PathVariable long id) {
        realStateServicePort.deleteRealStateById(id);
    }
}
