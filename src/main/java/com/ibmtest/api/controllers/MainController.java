package com.ibmtest.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ibmtest.api.models.Supplier;
import com.ibmtest.api.repositories.SupplierRepository;

/*
 * Configuración de CORS para permitir la conexion entre servidores localhost react/srping
 */
@Controller
@RequestMapping(path = "/ibmtest")
@CrossOrigin(origins = "http://localhost:3000", methods= {RequestMethod.GET,RequestMethod.POST})
public class MainController {

	@Autowired
	private SupplierRepository supplierRepository;

	/*
	 * Devuelve la info de los proveedores
	 */
	@GetMapping(path = "/supplier")
	public @ResponseBody Iterable<Supplier> getAllSuppliers() {
		return supplierRepository.findAll();
	}

	/*
	 * Devuelve la info del proveedor solicitado
	 */
	@GetMapping(path = "/supplier/{id}")
	public @ResponseBody Supplier getSupplier(@PathVariable("id") Integer id) {
		return supplierRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("No se ha encontrado el proveedor solicitado"));
	}

	/*
	 * Actualiza la puntuación del proveedor solicitado
	 */
	@PostMapping(path = "/supplier/{id}")
	public @ResponseBody Supplier postScore(@PathVariable("id") Integer id, @RequestBody Supplier supplier) {

		Supplier supplierToUpdate = supplierRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("No se ha encontrado el proveedor solicitado"));

		supplierToUpdate.setScore(supplier.getScore());
		supplierRepository.save(supplierToUpdate);
		

		return supplierToUpdate;
	}

}
