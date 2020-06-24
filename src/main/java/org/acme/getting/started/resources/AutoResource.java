package org.acme.getting.started.resources;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.getting.started.entity.Auto;
import org.acme.getting.started.entity.AutoRepository;

@Path("/auto")
public class AutoResource {

    @Inject
    AutoRepository autoRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/bmwcolor")
    public List<String> findBMWColor(){
        return autoRepository.findByMark("BMW").stream().map(Auto::getColor).collect(Collectors.toList());
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/minicolor")
    public List<String> findMiniColor(){
        return autoRepository.findByMark("MINI").stream().map(Auto::getColor).collect(Collectors.toList());
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/black")
    public List<String> findBlack(){
        return autoRepository.findByColor("Black").stream().map(Auto::getMark).collect(Collectors.toList());
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/red")
    public List<String> findRed(){
        return autoRepository.findByColor("Red").stream().map(Auto::getMark).collect(Collectors.toList());
    }

}