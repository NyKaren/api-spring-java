package com.wexapi.wex.controller;

import com.wexapi.wex.model.User;
import com.wexapi.wex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long userId) {
        return userService.getUser(userId);
    }

    @PostMapping("/add")
    public void save(User user) {
        userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") User user) {
        userService.deleteById(user.getId());
    }

    //localhost:8081/api/user/

    // ToDo search for:

    //Because of error:
//    ResponseEntity
//    using:
//            try {
//        return ResponseEntity.status(HttpStatus.OK).body(method));
//    } catch (Exception e) {
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//    }
    //Because of response:
//    @ResponseBody
//    @PathVariable(value = "id") Long userId
    // Get - Hability
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
