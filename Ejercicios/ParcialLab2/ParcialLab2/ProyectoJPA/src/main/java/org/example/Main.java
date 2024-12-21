package org.example;

import org.example.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            //PAIS
            entityManager.getTransaction().begin();
            Pais pais = new Pais("Argentina");
            entityManager.persist(pais);
            entityManager.getTransaction().commit();
            Pais retrievedPais = entityManager.find(Pais.class, pais.getId();
            System.out.println("Retrieved Pais: "  + retrievedPais.getNombre());
            //PROVINCIA
            Provincia provincia = new Provincia("Mendoza", pais);
            entityManager.persist(provincia);
            entityManager.getTransaction().commit();
            Provincia retrievedProvincia = entityManager.find(Provincia.class, provincia.getId());
            System.out.println("Retrieved Provincia: " + retrievedProvincia.getNombre());
            //LOCALIDAD
            Localidad localidad = new Localidad("Maipu", provincia);
            entityManager.persist(localidad);
            entityManager.getTransaction().commit();
            Localidad retrievedLocalidad = entityManager.find(Localidad.class, localidad.getId());
            System.out.println("Retrieved Localidad: " + retrievedLocalidad.getNombre());
            //DOMICILIO
            Domicilio domicilio = new Domicilio();
            entityManager.persist(domicilio);
            entityManager.getTransaction().commit();
            Domicilio retrievedDomicilio = entityManager.find(Domicilio.class, domicilio.getId());
            System.out.println("Retrieved Domicilio: " + retrievedDomicilio.getCalle());
            //SUCURSAL
            Sucursal sucursal = new Sucursal();
            entityManager.persist(sucursal);
            entityManager.getTransaction().commit();
            Sucursal retrievedSucursal = entityManager.find(Sucursal.class, sucursal.getId());
            System.out.println("Retrieved Sucursal: " + retrievedSucursal.getNombre());
            //EMPRESA
            Empresa empresa = new Empresa();
            entityManager.persist(empresa);
            entityManager.getTransaction().commit();
            Empresa retrievedEmpresa = entityManager.find(Empresa.class, empresa.getId());
            System.out.println("Retrieved Empresa: " + retrievedEmpresa.getNombre());
            //PROMOCION
            Promocion promocion = new Promocion();
            entityManager.persist(promocion);
            entityManager.getTransaction().commit();
            Promocion retrievedPromocion = entityManager.find(Promocion.class, promocion.getId());
            System.out.println("Retrieved Promocion: " + retrievedPromocion.getDenominacion());
            //IMAGEN PROMOCION
            ImagenPromocion imagenPromocion = new ImagenPromocion();
            entityManager.persist(imagenPromocion);
            entityManager.getTransaction().commit();
            ImagenPromocion retrievedImagenPromocion = entityManager.find(ImagenPromocion.class, imagenPromocion.getId());
            System.out.println("Retrieved ImagenPromocion: " + retrievedImagenPromocion.getDenomincaion());
            //PROMOCION DETALLE
            PromocionDetalle promocionDetalle = new PromocionDetalle();
            entityManager.persist(promocionDetalle);
            entityManager.getTransaction().commit();
            PromocionDetalle retrievedPromocionDetalle = entityManager.find(PromocionDetalle.class, promocionDetalle.getId());
            System.out.println("Retrieved PromocionDetalle: " + retrievedPromocionDetalle.getCantidad());
            //ARTICULO MANUFACTURADO
            ArticuloManufacturado articuloManufacturado = new ArticuloManufacturado();
            entityManager.persist(articuloManufacturado);
            entityManager.getTransaction().commit();
            ArticuloManufacturado retrievedArticuloManufacturado = entityManager.find(ArticuloManufacturado.class, articuloManufacturado.getId());
            System.out.println("Retrieved ArticuloManufacturado: " + retrievedArticuloManufacturado.getDescripcion());
            //ARTICULO MANUFACTURADO DETALLE
            ArticuloManufacturadoDetalle articuloManufacturadoDetalle = new ArticuloManufacturadoDetalle();
            entityManager.persist(articuloManufacturadoDetalle);
            entityManager.getTransaction().commit();
            ArticuloManufacturadoDetalle retrievedArticuloManufacturadoDetalle = entityManager.find(ArticuloManufacturadoDetalle.class, articuloManufacturadoDetalle.getId());
            System.out.println("Retrieved ArticuloManufacturadoDetalle: " + retrievedArticuloManufacturadoDetalle.getArticuloManufacturado());
            //ARTICULO INSUMO
            ArticuloInsumo articuloInsumo = new ArticuloInsumo();
            entityManager.persist(articuloInsumo);
            entityManager.getTransaction().commit();
            ArticuloInsumo retrievedArticuloInsumo = entityManager.find(ArticuloInsumo.class , articuloInsumo.getId());
            System.out.println("Retrieved ArticuloInsumo: " + retrievedArticuloInsumo.getDenomincion());
            //IMAGEN ARTICULO
            ImagenArticulo imagenArticulo = new ImagenArticulo();
            entityManager.persist(imagenArticulo);
            entityManager.getTransaction().commit();
            ImagenArticulo retrievedImagenArticulo = entityManager.find(ImagenArticulo.class, imagenArticulo.getId());
            System.out.println("Retrieved ImagenArticulo: " + retrievedImagenArticulo.getDenominacion());
            //UNIDAD MEIDIDA
            UnidadMedida unidadMedida = new UnidadMedida();
            entityManager.persist(unidadMedida);
            entityManager.getTransaction().commit();
            UnidadMedida retrievedUnidadMedida = entityManager.find(UnidadMedida.class, unidadMedida.getId());
            System.out.println("Retrieved UnidadMedida: " + retrievedUnidadMedida.getDenominacionl());
            //DETALLE PEDIDO
            DetallePedido detallePedido = new DetallePedido();
            entityManager.persist(detallePedido);
            entityManager.getTransaction().commit();
            DetallePedido retrievedDetallePedido = entityManager.find(DetallePedido.class, detallePedido.getId());
            System.out.println("Retrieved DetallePedido: " + retrievedDetallePedido.getPedido());
            //PEDIDO
            Pedido pedido = new Pedido();
            entityManager.persist(pedido);
            entityManager.getTransaction().commit();
            Pedido retrievedPedido = entityManager.find(Pedido.class, pedido.getId());
            System.out.println("Retrieved Pedido: " + retrievedPedido.getDetallePedido());
            //FACTURA
            Factura factura = new Factura();
            entityManager.persist(factura);
            entityManager.getTransaction().commit();
            Factura retrievedFactura = entityManager.find(Factura.class, factura.getId());
            System.out.println("Retrieved Factura: " + retrievedFactura.getId());
            //EMPLEADO
            Empleado empleado = new Empleado();
            entityManager.persist(empleado);
            entityManager.getTransaction().commit();
            Empleado retrievedEmpleado = entityManager.find(Empleado.class, empleado.getId());
            System.out.println("Retrieved Empleado: " + retrievedEmpleado.getNombre());
            //IMAGEN EMPLEADO
            Imagen_Empleado imagenEmpleado = new Imagen_Empleado();
            entityManager.persist(imagenEmpleado);
            entityManager.getTransaction().commit();
            Imagen_Empleado retrievedImagenEmpleado = entityManager.find(Imagen_Empleado.class, imagenEmpleado.getId());
            System.out.println("Retrieved ImagenEmpleado: " + retrievedImagenEmpleado.getDenominacion());
            //USUARIO EMPLEADO
            Usuario_Empleado usuarioEmpleado = new Usuario_Empleado();
            entityManager.persist(usuarioEmpleado);
            entityManager.getTransaction().commit();
            Usuario_Empleado retrievedUsuarioEmpleado = entityManager.find(Usuario_Empleado.class, usuarioEmpleado.getId());
            System.out.println("Retrieved UsuarioEmpleado: " + retrievedUsuarioEmpleado.getEmpleado());
            //CLIENTE
            Cliente cliente = new Cliente();
            entityManager.persist(cliente);
            entityManager.getTransaction().commit();
            Cliente retrievedCliente = entityManager.find(Cliente.class, cliente.getId());
            System.out.println("Retrieved Cliente: " + retrievedCliente.getNombre());
            //IMAGEN CLIENTE
            Imagen_Cliente imagenCliente = new Imagen_Cliente();
            entityManager.persist(imagenCliente);
            entityManager.getTransaction().commit();
            Imagen_Cliente retrievedImagenCliente = entityManager.find(Imagen_Cliente.class, imagenCliente.getId());
            System.out.println("Retrieved Cliente: " + retrievedImagenCliente.getDenominacion());
            //USUARIO LIENTE
            Usuario_Cliente usuarioCliente = new Usuario_Cliente();
            entityManager.persist(usuarioCliente);
            entityManager.getTransaction().commit();
            Usuario_Cliente retrievedUsuarioCliente = entityManager.find(Usuario_Cliente.class, usuarioCliente.getId());
            System.out.println("Retrieved UsuarioCliente: " + retrievedUsuarioCliente.getCliente());


        }catch (Exception e){
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            System.out.println("No se pudo completar la transacción.");
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        }



}
