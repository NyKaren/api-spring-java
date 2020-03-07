package com.wexapi.wex.controller;

import com.wexapi.wex.model.User;
import com.wexapi.wex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAll() {
        return userService.getAll();
    }

    public User getUser(Long userId) {
        return userService.getUser(userId);
    }

    public void save(User user) {
        userService.save(user);
    }

    public void delete(User user) {
        userService.delete(user);
    }

    // ToDo search for address endpoints:
    //@GetMapping
    //@PostMapping
    //@DeleteMapping
    //@PutMapping
    //@GetMapping("")
    //@PostMapping("/add")

    //Because of error:
//    ResponseEntity
//    using:
//            try {
//        return ResponseEntity.status(HttpStatus.OK).body(method));
//    } catch (Exception e) {
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//    }
    //Beacuse of response:
//    @ResponseBody
//    @PathVariable(value = "id") Long userId
    // Get - Habilidade
//    @GetMapping("/{id}")
//    public @ResponseBody Habilidade getHabilidadeById(@PathVariable(value = "id") Long habilidadeId) {
//        return habilidadeService.getHabilidadeById(habilidadeId);
//    }
    //Example update
    // Update Habilidade
//    @PutMapping("/upd/{id}")
//    @ApiOperation(value = "Atualizar uma habilidade pelo ID")
//    public ResponseEntity<Habilidade> updateHabilidade(@RequestBody Habilidade habilidade, @PathVariable Long id){
//
//        Optional<Habilidade> habilidadeOptional = Optional.ofNullable(habilidadeService.getHabilidadeById(id));
//
//        if (!habilidadeOptional.isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//
//        habilidadeService.updateHabilidade(habilidade, id);
//
//        return ResponseEntity.noContent().build();
//    }

}
