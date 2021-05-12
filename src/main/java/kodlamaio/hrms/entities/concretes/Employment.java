package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "employments")
public class Employment{

    @Id
    @GeneratedValue
    @Column(name = "employment_id")
    private Integer id;

    @Column(name = "employment_title")
    private String employmentTitle;

    public Employment(int id, String employmentTitle) {
        this.id = id;
        this.employmentTitle = employmentTitle;
    }

    public Employment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmploymentTitle() {
        return employmentTitle;
    }

    public void setEmploymentTitle(String employmentTitle) {
        this.employmentTitle = employmentTitle;
    }

}
