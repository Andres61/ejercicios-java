package SegurosGallego;

import java.util.Date;

class Pago {
    public Date fecha_Pago;
    public double monto_Pagado;

    public Pago(Date fecha_Pago, double monto_Pagado) {
        this.fecha_Pago = fecha_Pago;
        this.monto_Pagado = monto_Pagado;
    }

    public Date getFecha_Pago() {
        return fecha_Pago;
    }

    public void setFecha_Pago(Date fecha_Pago) {
        this.fecha_Pago = fecha_Pago;
    }

    public double getMonto_Pagado() {
        return monto_Pagado;
    }

    public void setMonto_Pagado(double monto_Pagado) {
        this.monto_Pagado = monto_Pagado;
    }
}
