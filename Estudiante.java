import javax.swing.JOptionPane;

public class Estudiante extends Persona {
    
    private String carnet;
    private int numMaterias;
    private double promedioNotas;
    
    public Estudiante() {
        
    }
    
    public Estudiante(String nombre, String apellido, int edad, double peso,
            String carnet, int numMaterias, double promedioNotas) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.numMaterias = numMaterias;
        this.promedioNotas = promedioNotas;
    }
    
    public String getCarnet() {
        return carnet;
    }
    
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
    public int getNumMaterias() {
        return numMaterias;
    }
    
    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }
    
    public double getPromedioNotas() {
        return promedioNotas;
    }
    
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    
    public void imprimirReporteEstadoEstudiante() {
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "El carnet del estudiante es: " + carnet);
        JOptionPane.showMessageDialog(null, "El número de materias inscritas es: " + numMaterias);
        JOptionPane.showMessageDialog(null, "El promedio de notas del estudiante es: " + promedioNotas);
    }
    
    public Estudiante ingresarDatosEstudiante() {
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        String carnet = "";
        int numMaterias = 0;
        double promedioNotas = 0.0;
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        numMaterias = leerDatoTipoEntero("Ingrese el número de materias inscritas por el estudiante: ");
        promedioNotas = leerDatoTipoReal("Ingrese el promedio de notas del estudiante: ");
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setNumMaterias(numMaterias);
        nuevoEstudiante.setPromedioNotas(promedioNotas);
        return (nuevoEstudiante);
    }
    
}
