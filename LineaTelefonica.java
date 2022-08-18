public class LineaTelefonica {
    
    private int numeroMinutos;
    private double costoLlamada;
    private int numeroLlamadas;

    public void inicializar( )
    {
        numeroMinutos =0;
        costoLlamada = 0;
        numeroLlamadas = 0 ;        
        
    }

  
    // metodo para agregar una llamada local 
    public void registrarLlamadaLocal( int minuto)
    
    {
        numeroLlamadas ++;
        numeroMinutos = numeroMinutos + minuto;
        costoLlamada = costoLlamada +(minuto*35);        
    }

    // metodo para agregar una llamada larga distancia 

    public void registrarLlamadaLargaDistancia( int minuto)
    
    {
        numeroLlamadas ++;
        numeroMinutos = numeroMinutos + minuto;
        costoLlamada = costoLlamada +(minuto*380);
        
    }

    // metodo para agregar una llamada de celular 
    public void registrarLlamadaCelular( int minuto)
    
    {
        numeroLlamadas ++;
        numeroMinutos = numeroMinutos + minuto;
        costoLlamada = costoLlamada +(minuto*999);
        
    }

    public int mostrarNumeroLlamadas()
    {
        return numeroLlamadas;

    }

    public int mostrarNumeroMinutos()
    {
        return numeroMinutos;
        
    }

    public double mostrarCostoLlamada()
    {
        return costoLlamada;
    }

   public void mostrarTotalLinea() 
   {
       
   }




}
