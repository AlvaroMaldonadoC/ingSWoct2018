/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoedad;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculoEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate fechaNac = LocalDate.parse("03/01/1995", fmt);
LocalDate ahora = LocalDate.now();

Period periodo = Period.between(fechaNac, ahora);
System.out.printf("Tu edad es: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
    
}
