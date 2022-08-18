public class Empresa {

    public LineaTelefonica Linea1;
    public LineaTelefonica Linea2;
    public LineaTelefonica Linea3;


    public void inicializar()
    {
        Linea1 = new LineaTelefonica ();
        Linea1.inicializar();

        Linea2 = new LineaTelefonica ();
        Linea2.inicializar();

        Linea3 = new LineaTelefonica ();
        Linea3.inicializar();
    }


    public LineaTelefonica darLinea1()
    {
        return Linea1; 
    }

    public LineaTelefonica darLinea2()
    {
        return Linea2; 
    }
    public LineaTelefonica darLinea3()
    {
        return Linea3; 
    }
    // Metodos para agregar llamada para linea 1 
    public void agregarLlamadaLocalLinea1(int minutosRealizados)
    {
        Linea1.registrarLlamadaLocal(minutosRealizados);
    }

    public void agregarLlamadalargaDistanciaLinea1(int minutosRealizados)
    {
        Linea1.registrarLlamadaLargaDistancia(minutosRealizados);
    }

    public void agregarLlamadaCelularLinea1(int minutosRealizados)
    {
        Linea1.registrarLlamadaCelular(minutosRealizados);
    }

    // Metodos para agregar llamada para la linea 2
    public void agregarLlamadaLocalLinea2(int minutosRealizados)
    {
        Linea2.registrarLlamadaLocal(minutosRealizados);
    }

    public void agregarLlamadalargaDistanciaLinea2(int minutosRealizados)
    {
        Linea2.registrarLlamadaLargaDistancia(minutosRealizados);
    }

    public void agregarLlamadaCelularLinea2(int minutosRealizados)
    {
        Linea2.registrarLlamadaCelular(minutosRealizados);
    }

    // Metodos para agregar llamada para la linea 3
    public void agregarLlamadaLocalLinea3(int minutosRealizados)
    {
        Linea3.registrarLlamadaLocal(minutosRealizados);
    }

    public void agregarLlamadalargaDistanciaLinea3(int minutosRealizados)
    {
        Linea3.registrarLlamadaLargaDistancia(minutosRealizados);
    }

    public void agregarLlamadaCelularLinea3(int minutosRealizados)
    {
        Linea3.registrarLlamadaCelular(minutosRealizados);
    }



    // Totalizacion de todos los valores 


    public int totalMinutos()
    {
        return Linea1.mostrarNumeroMinutos()+Linea2.mostrarNumeroMinutos()+Linea3.mostrarNumeroMinutos();
    }
    
    public int totalLlamadas()
    {
        return Linea1.mostrarNumeroLlamadas()+Linea2.mostrarNumeroLlamadas()+Linea3.mostrarNumeroLlamadas();
    }

    public double totalCostoLlamadas()
    {
        return Linea1.mostrarCostoLlamada()+Linea2.mostrarCostoLlamada()+Linea3.mostrarCostoLlamada();
    }


    public void reiniciar()
    {
        Linea1.inicializar();
        Linea2.inicializar();
        Linea3.inicializar();
    }

   
}
