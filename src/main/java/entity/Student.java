package entity;

import embed.FullName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity/*(name = "Children") ------> project ek purama nama wenas wenawa*/
/*@Table*//*(name = "Student") ------> hibernate thamange entity eke name ek wenas karaganne naha */
public class Student {
    @Id
    private  int id;
    private FullName name;
    private String address;
}
