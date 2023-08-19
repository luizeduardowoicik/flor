package br.unitins.topicos1.resource;

import java.util.List;
import br.unitins.topicos1.model.Flor;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/flor")
public class FlorResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Flor> todosFlores(){
        return Flor.listAll();
    }
}