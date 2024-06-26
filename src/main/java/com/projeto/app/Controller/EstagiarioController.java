package com.projeto.app.Controller;

import com.projeto.app.Model.Estagiario;
import com.projeto.app.Repository.EstagiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estagiarios")
public class EstagiarioController {

    @Autowired
    private EstagiarioRepository estagiarioRepository;
    @GetMapping
    public List<Estagiario> listar(){
        return  estagiarioRepository.findAll();
    }
    @GetMapping("/excluir")
    public void excluir(@RequestBody Estagiario estagiario){
        estagiarioRepository.delete(estagiario);
    }

    @PostMapping("/excluirById")
    public void excluirById(@RequestBody Estagiario estagiario){estagiarioRepository.deleteById(estagiario.getId());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Estagiario adicionar(@RequestBody Estagiario estagiario){
        return estagiarioRepository.save(estagiario);
    }

}
