package cuentas;

/**
 * Esta clase simula una cuenta bancaria.
 * @author Luis
 * @version 1.0
 * @see <a href=https://wiki.eclipse.org/Main_Page> Enlace de test </a>
 * 
 */
public class CCuenta {

    /**
     * Nombre del propietario
     */
    private String nombre;
    /**
     * Número de cuenta separado por guiones
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés
     */
    private double tipoInteres;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor completo
     * @param nom Nombre del propietario
     * @param cue Número de cuenta separado por guiones
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }

    /**
     * @return Saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * @param cantidad Cantidad a ingresar
     * @throws Exception Cantidad negativa no válida
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * @param cantidad Cantidad a retirar
     * @throws Exception Cantidad negativa no válida
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return Nombre del propietario
     */
    public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Nombre del propietario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Número de cuenta separado por guiones
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta Número de cuenta separado por guiones
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return Saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo Saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return Tipo de interés
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres Tipo de interés
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
