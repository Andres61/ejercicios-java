package SegurosGallego;

import java.util.ArrayList;
import java.util.Date;

public class PolizaSeguro {
    public String numero_Poliza;
    public String tipo_Seguro;
    public double monto_Prima;
    public ArrayList<Pago> pagos;

    public PolizaSeguro(String numeroPoliza, String tipoSeguro, double montoPrima)
    {
        this.numero_Poliza = numero_Poliza;
        this.tipo_Seguro = tipo_Seguro;
        this.monto_Prima = monto_Prima;
        this.pagos = new ArrayList<Pago>();
    }

    public void registrar_Pago(double monto)
    {
        Date fecha_Pago = new Date();
        Pago pago = new Pago(fecha_Pago, monto);
        this.pagos.add(pago);
    }

    public double obtener_Saldo() {
        double total_Pagos = 0;
        for (Pago pago : this.pagos)
        {
            total_Pagos += pago.getMonto_Pagado();
        }
        return this.monto_Prima - total_Pagos;
    }

    public ArrayList<Pago> obtener_Pagos()
    {
        return this.pagos;
    }

    public String getNumero_Poliza()
    {
        return numero_Poliza;
    }

    public void setNumero_Poliza(String numero_Poliza)
    {
        this.numero_Poliza = numero_Poliza;
    }

    public String getTipo_Seguro()
    {
        return tipo_Seguro;
    }

    public void setTipo_Seguro(String tipo_Seguro)
    {
        this.tipo_Seguro = tipo_Seguro;
    }

    public double getMonto_Prima()
    {
        return monto_Prima;
    }

    public void setMonto_Prima(double monto_Prima)
    {
        this.monto_Prima = monto_Prima;
    }

    public void setPagos(ArrayList<Pago> pagos)
    {
        this.pagos = pagos;
    }
}

