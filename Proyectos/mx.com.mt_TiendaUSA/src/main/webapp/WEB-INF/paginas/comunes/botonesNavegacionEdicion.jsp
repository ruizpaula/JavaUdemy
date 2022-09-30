<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a href="index.jsp" class="btn btn-ligth btn-block">
                    <i class="fas fa-arrow-left"></i> Regresar al inicio
                </a>
            </div>
            <div class="col-md-3">
                <button type="submit" class="btn btn-secondary btn-block">
                    <i class="fas fa-check"></i> Guardar Producto
                </button>
            </div>
            <div class="col-md-3">
                <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminar&codigo=${producto.codigo}"
                   class="btn btn-danger btn-block"><i class="fas fa-angle-double-right"></i> Editar</a>
                    <i class="fas fa-trash"></i> Eliminar Producto
                </a>
            </div>
        </div>
    </div>
</section>