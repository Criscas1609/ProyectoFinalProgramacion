package co.edu.cue.proyectofinalcorte3.service.impl;

import co.edu.cue.proyectofinalcorte3.model.Client;
import co.edu.cue.proyectofinalcorte3.model.ClientDTO;
import co.edu.cue.proyectofinalcorte3.service.ClientService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientServiceImpl implements ClientService {
    public List<Client> listClients = new ArrayList<Client>();
    public HashMap<String,Client> clientHashMap = new HashMap<String,Client>();
    public void data(){
        Client p1 = new Client("Cristhian","Correa","Masculino", "16/04/2004","123456898","310547852","Carrera 6251");
        Client p2 = new Client("Camilo","Ceballos","Masculino", "16/04/2004","123456898","310547852","Carrera 6251");
        Client p3 = new Client("Paula","Builes","Femenino","07/03/2004","123456898","31054722","Carrera 6510");
        Client p4 = new Client("Derly","Quejada","Femenino","24/04/2005","123456898","31054722","Carrera 6510");

        listClients.add(p1);
        listClients.add(p2);
        listClients.add(p3);
        listClients.add(p4);

    }

    public Stream<Client> search(String name){
        return listClients.stream()
                .filter(c-> name.equalsIgnoreCase(c.getName()))
                .limit(1);
    }

    //retorna una lista con el DTOs
    public List<ClientDTO> generateListDTOs(){
        return  listClients.stream()
                .map(client-> new ClientDTO(client.getName(),client.getBirthday()))
                .collect(Collectors.toList());
    }

    public void create(String name, String lastName, String gender, String birthday, String id, String phoneNumber, String address){
        clientHashMap.put(id,new Client(name,lastName,gender,birthday,id,phoneNumber,address));
    }
    // elimina un objeto por su id
    public void delete(String id){
        clientHashMap.remove(id);
    }
    // recorre por el método de foreach
    public void tour(){
        for(Map.Entry<String, Client> entrada: clientHashMap.entrySet()) {
            String clave= entrada.getKey();
            Client client=entrada.getValue();
        }
    }

    public void comparator(){
        listClients.sort(new ComparatorClient());
    }


    }





