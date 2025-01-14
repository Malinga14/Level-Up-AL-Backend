package lk.edu.icet110.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String phoneNo;

}
