package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Employment;

import java.util.List;

public interface EmploymentService {
    public List<Employment> getAll();
}
