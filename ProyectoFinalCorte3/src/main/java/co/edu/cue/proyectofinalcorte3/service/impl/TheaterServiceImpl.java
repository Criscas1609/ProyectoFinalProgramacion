package co.edu.cue.proyectofinalcorte3.service.impl;

import co.edu.cue.proyectofinalcorte3.service.AdministrativeService;
import co.edu.cue.proyectofinalcorte3.service.ClientService;
import co.edu.cue.proyectofinalcorte3.service.EmployeeService;

public class TheaterServiceImpl {

    private final ClientService clientService;
    private final EmployeeService employeeService;
    private final AdministrativeService administrativeService;

    public TheaterServiceImpl(){
        clientService = (ClientService) new ClientServiceImpl();
        employeeService = (EmployeeService) new EmployeeServiceImpl();
        administrativeService = (AdministrativeService) new AdministrativeServiceImpl();
    }

    public ClientService getClientService() {
        return clientService;
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public AdministrativeService getAdministrativeService() {
        return administrativeService;
    }
}
