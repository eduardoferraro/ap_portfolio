package com.ap_portfolio.efe9.Controller;
import com.ap_portfolio.efe9.Entity.Persona;
import com.ap_portfolio.efe9.Interface.IPersonaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/listar")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PostMapping("personas/nuevo")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "Operacion existosa";
    }
    
    
    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "Operacion existosa";
    }
    
    
    @PutMapping("personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id, 
                                @RequestParam("nombre") String nNombre,
                                @RequestParam("apellido") String nApellido,
                                @RequestParam("fechaNacimiento") Date nFechaNacimiento,
                                @RequestParam("email") String nEmail,
                                @RequestParam("telefono") String nTelefono,
                                @RequestParam("imagenPersona") String nImagenPersona,
                                @RequestParam("textoPersona") String nTextoPersona,
                                @RequestParam("textoHabilidad") String nTextoHabilidad
                                ) 
    {
            
         Persona persona = ipersonaService.findPersona(id);
         persona.setNombre(nNombre);
         persona.setApellido(nApellido);
         persona.setFechaNacimiento(nFechaNacimiento);
         persona.setEmail(nEmail);
         persona.setTelefono(nTelefono);
         persona.setImagenPersona(nImagenPersona);
         persona.setTextoPersona(nTextoPersona);
         persona.setTextoHabilidad(nTextoHabilidad);
         
         ipersonaService.savePersona(persona);
         
         return persona;
         
         
    
        
    }
    
    
    
}
