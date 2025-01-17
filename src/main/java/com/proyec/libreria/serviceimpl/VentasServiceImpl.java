package com.proyec.libreria.serviceimpl;

import com.proyec.libreria.entity.Ventas;
import com.proyec.libreria.repository.VentasRepository;
import com.proyec.libreria.service.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentasServiceImpl implements VentasService {

    @Autowired
    private VentasRepository ventasRepository;

    @Override
    public Ventas saveVenta(Ventas venta) {
        return ventasRepository.save(venta);
    }

    @Override
    public Ventas updateVenta(Ventas venta, Long id) {
        if (ventasRepository.existsById(id)) {
            venta.setId_Venta(id);
            return ventasRepository.save(venta);
        }
        return null;
    }

    @Override
    public Ventas getVentaById(Long id) {
        return ventasRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteVenta(Long id) {
        ventasRepository.deleteById(id);
    }

    @Override
    public List<Ventas> getAllVentas() {
        return ventasRepository.findAll();
    }
}
