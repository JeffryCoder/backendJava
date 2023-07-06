
public class CalculadoraSalario {

    public static void main (String[] args) {
        // Calculadora de salario

        // Salario base

        double sueldoBruto = 30240;

        double sueldoAnual = sueldoBruto * 12;

        double descuentoAFP = 0;
        double descuentoARS = 0;
        double descuentoISR = 0;
        double sueldoNeto = 0;



        
        
        System.out.println("----------------------------------------");
        System.out.println("|        Calculadora de salario        |");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Tu tu sueldo bruto es de: RD$" +  (int) sueldoBruto + ".00");
        System.out.println("");
        
        System.out.println("");
        System.out.println("Tu tu sueldo anual es de: RD$" + sueldoAnual);
        System.out.println("");
    }

}