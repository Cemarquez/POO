/*
HOLA MUNDO.
*/

/**
 * importa imagenes.
 */
import javax.swing.ImageIcon;
/**
 * Genera interfaz.
 */
import javax.swing.JOptionPane;
/**
 * APLICACION NETFLIX (SIMULACION)
 * @author Kevin Orlando Franco Ballejo - Cesar Esteban Marquez Meneses - Braian Camilo Piedrahita - Juan Camilo Valbuena.
 */
public class ProyectoParte2 
{
    /*
    SECCION VARIABLES ESTATICAS DE CLASE.
    */
    
    /**
     * Variable que nos permite asignar un icono.
     */
    public static ImageIcon iconNetflix02 = new ImageIcon("src/iconNetflix5.png");
    /**
     * Variable que nos permite asignar un icono.
     */ 
    public static ImageIcon iconNetflix = new ImageIcon("src/iconNetflix4.png");
    /**
     * variable que referencia el arreglo del indice ordenado de peliculas en enteros.
     */
    public static int indicePeliculas[];
    /**
     * variable que referencia el arreglo del indice ordenado de clientes en enteros.
     */
    public static int indiceClientes[];
    /**
     * variable que referencia el arreglo del indice ordenado de categorias en enteros.
     */
    public static int indiceCategorias[];
    /**
     * variable que referencia el arreglo del clon ordenado de categorias en cadena.
     */
    public static String cloneCategorias[];
    /**
     * variable que referencia el arreglo del clon ordenado de clientes en cadena.
     */
    public static String cloneClientes[];
    /**
     * variable que referencia el arreglo del clon ordenado de peliculas en cadena.
     */
    public static String clonePeliculas[];
    /**
     * variable que referencia el arreglo que indica categorias en cadena.
     */
    public static String categorias[];
    /**
     * variable que indica el maximo de categorias en enteros.
     */
    public static int maxCategorias;
    /**
     * variable que referencia el arreglo que indica clientes en cadena.
     */
    public static String clientes[];
    /**
     * variable que indica el maximo de clientes en enteros.
     */
    public static int maxClientes;
    /**
     * variable que referencia el arreglo que indica el sexo por cliente en cadena.
     */
    public static String sexoCliente[];
    /**
     * variable que referencia el arreglo que indica peliculas en cadena.
     */
    public static String peliculas[];
    /**
     * variable que indica el maximo de peliculas en enteros.
     */
    public static int maxPeliculas;
    /**
     * variable que indica el maximo de categorias por peliculas en enteros.
     */
    public static int maxCategoriaPelicula;
    /**
     * variable que referencia un arreglo que indica categorias por peliculas en enteros.
     */
    public static int asignarCategoriaPelicula[];
    /**
     * variable que referencia un arreglo que indica peliculas favoritas en enteros.
     */
    public static int favoritas[];
    /**
     * variable que indica el maximo de peliculas favoritas en enteros.
     */
    public static int maxFavoritas;
    /**
     * Constante que almacena "Masculino" para el sexo.
     */
    public static final String MASCULINO="Masculino";
    /**
     * Constante que almacena "Femenino" para el sexo.
     */
    public static final String FEMENINO="Femenino";
    
    
    
    
    
    /**
     * Metodo Principal.
     * @param args 
     */
    public static void main(String[] args) 
    {
        //llenarDatosPrueba();
        //leerFavoritasUsuario();
        
        if(acercaDeNetflix()==0)
        {
            leerCategorias();
            leerClientes();
            leerPeliculas();
            leerFavoritasUsuario();
            parteFinal();
        }
    }
    /**
     * Metodo que muestra un mensaje acerca de los agradecimientos y fuentes utilizadas (web).
     */
    public static void parteFinal ()
    {
        imprimir("NETFLIX, INC. \n GRACIAS POR PREFERIRNOS \n\n Fuentes utilizadas: \n https://www.netflix.com \n https://es.wikipedia.org/wiki/Netflix");
    }
    /**
     * Metodo que muestra un mensaje acerca de netflix y pasos a seguir del usuario.
     * @return 
     */
    public static int acercaDeNetflix ()
    {
        imprimir("NETFLIX \n Tu próxima historia, ahora. \n\n \"Disfruta Donde Quieras. Cancela Cuando Quieras\".");
        int contrato=JOptionPane.showConfirmDialog(null,"                                                     -BIENVENIDO A NETFLIX- \n\n Netflix, Inc. es una empresa comercial estadounidense de entretenimiento que proporciona \n mediante tarifa plana mensual streaming (flujo) multimedia (principalmente, películas, \n series de televisión) y documentales bajo demanda por Internet y de DVD-por correo, \n donde los DVD se envían mediante Permit Reply Mail. \n\n La empresa fue fundada en el año 1997 y tiene su sede en Los Gatos (California). \n Comenzó su servicio basado en suscripción en 1999. \n\n ¿Aceptas los \"Terminos y Condiciones\"?.");
        if(contrato==0)
        {
            imprimir("GUIA: \"PASOS A SEGUIR\" \n\n 1. Ingresar Categorias de Preferencia (3) \n\n 2. Ingresar Cada Cliente con su Respectivo Sexo \n\n 3. Ingresar el Nombre de Peliculas con su Respectiva Categoria \n\n 4. Seleccionar la Pelicula Favorita por Cada Categoria por Cliente");
        }
        return contrato;
    }
    /**
     * Metodo que pregunta al usuario las categorias.
     */
    public static void leerCategorias ()
    {
        maxCategorias = leerEntero("¿Cuantas categorias desea ingresar? ");
        categorias = new String[maxCategorias];
        int id;
        for(id=0;id<categorias.length;id++)
        {
            categorias[id] = leerCadena("Ingrese la categoria " + (id+1) + " de " + maxCategorias);
        }
        cloneCategorias=categorias.clone();
        ordenar(cloneCategorias);
        indiceCategorias=ordenarObtenerIndice(categorias);
        imprimir(obtenerListadoCategorias());
    }
    
    /**
     * Método que le pregunta al usuario leer todos los clientes con su sexo.
     */
    public static void leerClientes ()
    {
        maxClientes= leerEntero("¿Cuantos clientes desea ingresar? ");
        clientes = new String [maxClientes];
        sexoCliente = new String[maxClientes];
        int id;
        for(id=0;id<maxClientes;id++)
        {
        clientes[id] = leerCadena("Ingrese el nombre del cliente " + (id+1) + " de " + maxClientes);
        sexoCliente[id] = leerSexo("Ingrese el sexo de  " + clientes[id]);
        }
        cloneClientes=clientes.clone();
        ordenar(cloneClientes);
        indiceClientes=ordenarObtenerIndice(clientes);
        imprimir( obtenerListadoClientes() );
        imprimir (obtenerListadoClientesPorSexo());
    }
    /**
     * Metodo que pregunta al usuario las categorias.
     */
    public static void leerPeliculas ()
    {
        maxPeliculas = leerEntero ("¿Cuantas películas desea ingresar?");
        peliculas = new String [maxPeliculas];
        maxCategoriaPelicula = leerEntero("¿Cuantas categorias desea por cada pelicula?");
        asignarCategoriaPelicula = new int [(maxPeliculas*maxCategoriaPelicula)+1];
        int id,j;
        int min =0;
        for(id=0;id<(maxPeliculas*maxCategoriaPelicula)+1;id++)
        {
            asignarCategoriaPelicula[id]=-1;
        }
        for(id=0;id<maxPeliculas;id++)
        {
            peliculas[id]=leerCadena("Ingrese el nombre de la película " + (id+1) + " de " + maxPeliculas);
            for(j=1;j<=maxCategoriaPelicula;j++)
            {
                if(j==1)
                {
                    asignarCategoriaPelicula[j+id]= (leerEnteroRango(obtenerListadoCategorias() + "\n \n 0.Ninguna", min, maxCategorias))-1;
                }
                else
                {
                    asignarCategoriaPelicula[(j+maxPeliculas)+(id-1)]= (leerEnteroRango(obtenerListadoCategorias() + "\n \n 0.Ninguna", min, maxCategorias))-1;
                }
            }
        }
        clonePeliculas=peliculas.clone();
        ordenar(clonePeliculas);
        indicePeliculas=ordenarObtenerIndice(peliculas);
        imprimir(obtenerListadoCategoriasPorPeliculas ());
        imprimir(obtenerListadoPeliculaPorCategorias ());
    }
    /**
     * Metodo que le pregunta al usuario las peliculas favoritas por categoria por cada cliente.
     */
    public static void leerFavoritasUsuario()
    {
        int idCliente, idCategoria, idFavorita, min =0;
        maxFavoritas = leerEntero ("¿Cuantas películas favoritas por categoria desea por cada cliente?");
        favoritas= new int [(maxClientes*maxFavoritas*maxCategorias)+1];
        for(idFavorita=0;idFavorita<(maxClientes*maxFavoritas*maxCategorias)+1;idFavorita++)
        {
            favoritas[idFavorita]=-1;
        }
        for(idCliente=0; idCliente<maxClientes; idCliente++)
        {
            for(idCategoria=0; idCategoria< maxCategorias; idCategoria++)
            {
                for (idFavorita= 1; idFavorita <= maxFavoritas; idFavorita++)
                {
                    if(idFavorita==1)
                    {
                        if(idCategoria==0)
                        {
                            favoritas[(idCliente+1)]= (leerEnteroRango(obtenerListadoNumeroFavorita(idCliente, idCategoria, idFavorita), min, obtenerCantidadPeliculasEnCategoria(idCategoria)))-1;
                        }
                        else
                        {
                            favoritas[(idCliente+1)+(maxClientes*idCategoria)]= (leerEnteroRango(obtenerListadoNumeroFavorita(idCliente, idCategoria, idFavorita), min, obtenerCantidadPeliculasEnCategoria(idCategoria)))-1;
                        }
                    }
                    else
                    {
                        favoritas[(idCliente+1) + (maxClientes*maxCategorias+(maxClientes*idCategoria))]= (leerEnteroRango(obtenerListadoNumeroFavorita(idCliente, idCategoria, idFavorita), min, obtenerCantidadPeliculasEnCategoria(idCategoria)))-1;
                    }
                }
            }
        }
        imprimir(obtenerListadoPeliculasFavoritasPorUsuario());
        contarFavoritismoPeliculas();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Metodo que obtiene las categorias por peliculas en enteros.
     * @param idPelicula Numero de la pelicula que se desea seleccionar.
     * @param idCategoria Numero de la categoria que se desea seleccionar.
     * @return categoria seleccionada.
     */
    public static int obtenerCategoriaPelicula(int idPelicula, int idCategoria)
    {
        int categoriaSeleccionada;
        if(idCategoria==1)
            {
                categoriaSeleccionada = asignarCategoriaPelicula[idCategoria+idPelicula];
            }
            else
            {
                categoriaSeleccionada = asignarCategoriaPelicula[(idCategoria+maxPeliculas)+(idPelicula-1)];
            }
        return categoriaSeleccionada;
    }
    
     /**
     * Método que obtiene la lista de todas las categorías en forma de cadena.
     * @return cadena con todas las categorías.
     */  
    public static String obtenerListadoCategorias()
    {
        int id;
        String listado= "LISTADO DE CATEGORIAS \n";
        for (id=0; id < maxCategorias; id++)
        {
            listado += (id+1) + ". " + cloneCategorias[id] + "\n";
        }
        return listado;
    }
    /**
    * Método que obtiene la lista de todos los clientes en forma de cadena.
    * @return Cadena con todos los clientes.
    */
    public static String obtenerListadoClientes()
    {
        int id, indice[];
        String sexo[] = obtenerSexoCliente();
        String listado;
        indice=ordenarObtenerIndice(clientes);
        ordenarAsignarIndice(sexo, indice);
        listado= "LISTADO DE CLIENTES \n";
        for (id=0; id < maxClientes; id++)
        {
            listado += (id+1) + ". " + cloneClientes[id] + " - Sexo: " + sexo[id] + "\n";
        }
    return listado;
    }
    /**
     * Metodo que asigna y obtiene el sexo de todos los clientes en cadena.
     * @return listado del sexo de cada cliente.
     */
    public static String[] obtenerSexoCliente()
    {
        String sexo[];
        sexo = new String[maxClientes];
        int i;
        for (i=0;i<maxClientes;i++)
        {
            if(sexoCliente[i].equalsIgnoreCase("m"))
            {
                sexo[i] = MASCULINO;
            }
            else
            {
                sexo[i] = FEMENINO;
            }
        }
        return sexo;
    }
    /**
    * Método que obtiene la lista de clientes por Sexo.
    * @return Cadena con todos los clientes por su sexo.
    */
    public static String obtenerListadoClientesPorSexo()
    {
        int i, j;
        String listado;
        listado= "LISTADO DE CLIENTES POR SEXO \n" + FEMENINO + ":";
        for (i=0; i <maxClientes; i++)
        {
            switch (sexoCliente[indiceClientes[i]])
            {
                case "f": listado += " \"" + cloneClientes[i] + "\" ";
                break;
                case "F": listado += " \"" + cloneClientes[i] + "\" ";
                break;
            }
        }
        listado += "\n" + MASCULINO + ":";
        for (j=0; j<maxClientes; j++)
        {
            switch (sexoCliente[indiceClientes[j]])
            {
                case "m": listado += " \"" + cloneClientes[j] + " \"";
                break;
                case "M": listado += " \"" + cloneClientes[j] + " \"";
                break;
            }
        }
        return listado;
    }
    /**
    * Metodo que obtiene el listado de las categorias de una pelicula.
    * @param idCategoria numero de la categoria que se desea seleccionar.
    * @param idPelicula numero de la pelicula que se desea seleccionar.
    * @return 
    */
    public static String obtenerListadoCategoriasEnPeliculas (int idCategoria, int idPelicula)
    {
        String categoria = "";
        int posicionPelicula;
        for(posicionPelicula=1; posicionPelicula<=maxCategoriaPelicula; posicionPelicula++)
        {
            if(posicionPelicula == 1)
            {
                if(asignarCategoriaPelicula[posicionPelicula + idPelicula] == idCategoria)
                {
                    categoria += " \"" + (cloneCategorias[idCategoria] + "\"" + " ");
                }
            }
            else
            {
                if(asignarCategoriaPelicula[(posicionPelicula+maxPeliculas) + (idPelicula-1) ] == idCategoria)
                {
                    categoria += " \"" + (cloneCategorias[idCategoria] + "\"" + " ");
                }
            }
        }
        return categoria;
    }
    /**
    * Método que obtiene la lista de las categorías por película.
    * @return Cadena con todas las categorías por película.
    */
    public static String obtenerListadoCategoriasPorPeliculas ()
    {
        int idPelicula, categoria, i, contar=1;
        String listado;
        listado="LISTADO DE CATEGORIAS POR PELICULAS \n";
        for( idPelicula=0; idPelicula < maxPeliculas; idPelicula++)
        {
            listado += (contar + ". " + clonePeliculas[idPelicula] + ": ");
            contar++;
            for(categoria=0;categoria<maxCategorias;categoria++)
            {
                listado += obtenerListadoCategoriasEnPeliculas(indiceCategorias[categoria], indicePeliculas[idPelicula]);  
            }
            listado +=  "\n";
        }
        return listado;
    }
    /**
     * Metodo que obtiene el listado de las peliculas por categorias.
     * @return lista con las peliculas por categorias.
     */
    public static String obtenerListadoPeliculaPorCategorias ()
    {
        int id;
        String listado;
        listado="LISTADO DE PELICULAS POR CATEGORIAS \n";
        for(id = 0; id < maxCategorias; id++)
        {
            listado += (id + 1) + "." + cloneCategorias[id] + "(" + contarPeliculaEnCategoria(id) + ") : " +
                    obtenerListadoPeliculasEnCategoria(id)+ "\n";
        }
        return listado;
    }
    /**
     * Método que cuenta la cantidad de películas por categoría.
     * @param idCategoria Número de la categoría que desea seleccionar. 
     * @return Cantidad de películas en la categoría seleccioada.
     */
    public static int contarPeliculaEnCategoria(int idCategoria)
    {
        int categoria, idPelicula, contar=0;
        for(idPelicula = 0; idPelicula < maxPeliculas; idPelicula++)
        {
            for(categoria=1;categoria<=maxCategoriaPelicula;categoria++)
            {
                if(obtenerCategoriaPelicula(idPelicula,categoria)==idCategoria)
                {
                    contar++;
                }
            }
        }
        return contar;
    }
    /**
    * Método que retorna la lista de las películas de una categoría.
    * @param idCategoria Número que identifica una categoría.
    * @return Lista de las películas en la categoría indicada.
    */
    public static String obtenerListadoPeliculasEnCategoria (int idCategoria)
    {
        String listadoPeliculas = "";
        int contar = 1, idPelicula, numeroCategoria;
        for(idPelicula = 0; idPelicula < maxPeliculas; idPelicula++)
        {
            for(numeroCategoria=1;numeroCategoria<=maxCategoriaPelicula;numeroCategoria++)
            {
                if(obtenerCategoriaPelicula(idPelicula,numeroCategoria)==idCategoria)
                {
                    listadoPeliculas += (contar + ". \"" + clonePeliculas[idPelicula]+ "\" ");
                    contar++;
                }
            }
        }
        return listadoPeliculas;
    }
    /**
     * Metodo que obtiene la cantidad de peliculas que hay en una categoria.
     * @param idCategoria numero de la categoria que se desea seleccionar.
     * @return numero entero con el resultado del conteo.
     */
    public static int obtenerCantidadPeliculasEnCategoria (int idCategoria)
    {
        int contar = 0, idPelicula, numeroCategoria;
        for(idPelicula = 0; idPelicula < maxPeliculas; idPelicula++)
        {
            for(numeroCategoria=1;numeroCategoria<=maxCategoriaPelicula;numeroCategoria++)
            {
                if(obtenerCategoriaPelicula(idPelicula,numeroCategoria)==idCategoria)
                {
                    contar++;
                }
            }
        }
        return contar;
    }
    /**
     * Registra la posición de la película según el orden de la película escogida en la categoría seleccionada.
     * @param idCliente Cliente al que se desea acceder.
     * @param idCategoria Categoría seleccionada.
     * @param idFavorita numero favorita por categoria.
     * @return película segun la posicion por categoría.
     */
    public static String registroPeliculas (int idCliente, int idCategoria, int idFavorita)
    {
        String listadoPeliculas="";
        int id=-1, idPelicula, numeroCategoria;
        
        for(idPelicula = 0; idPelicula < maxPeliculas; idPelicula++)
        {
            for(numeroCategoria=1;numeroCategoria<=maxCategoriaPelicula;numeroCategoria++)
            {
                if(obtenerCategoriaPelicula(idPelicula,numeroCategoria)==idCategoria)
                {
                    id++;
                    if(obtenerPeliculaFavoritaCliente(idCategoria, idCliente, idFavorita)==id)
                    {
                        listadoPeliculas=" \"" +  clonePeliculas[idPelicula] + "\"";
                    }
                }
            }
        }
        return listadoPeliculas;
    }
    /**
     * Metodo que obtiene la pelicula favorita de cada cliente segun su categoria.
     * @param idCategoria numero de la categoria que se desea seleccionar.
     * @param idCliente numero  del cliente que se desea seleccionar.
     * @param idFavorita numero de la posicion que se puso la pelicula favorita.
     * @return numero de la pelicula favorita por cliente.
     */
    public static int obtenerPeliculaFavoritaCliente (int idCategoria, int idCliente, int idFavorita)
    {
        int favoritaSeleccionada;
        if(idFavorita==1)
        {
            if(idCategoria==0)
            {
                //De 1 a 5
                favoritaSeleccionada=favoritas[idCliente+1];
            }
            else
            {
                //De 6 a 10
                favoritaSeleccionada=favoritas[(idCliente+1)+(maxClientes*idCategoria)];
            }
        }
        else
        {
            //De 11 a infinity
            favoritaSeleccionada=favoritas[(idCliente+1) + (maxClientes*maxCategorias+(maxClientes*idCategoria))];
        }
        return favoritaSeleccionada;
    }
    /**
     * Metodo que obtiene el listado de peliculas favoritas de cada categoria por cliente .
     * @return listado de peliculas favoritas de cada categoria por cliente.
     */
    public static String obtenerListadoPeliculasFavoritasPorUsuario()
    {
        int contar=1, idCategoria, idCliente;
        String listado;
        listado="LISTADO DE PELICULAS FAVORITAS POR USUARIO \n";
        
        for(idCliente=0; idCliente < maxClientes; idCliente++)
        {
            listado += (contar + ". " + cloneClientes[idCliente] + "\n");
            contar++;
            for(idCategoria=0; idCategoria<maxCategorias; idCategoria++)
            {
                listado +=   obtenerListadoPeliculasEnCategoriaFavoritismo(idCliente, idCategoria);
            }
            listado +=  "\n";
        }
        return listado;
    }
    /**
     * Metodo que obtiene las peliculas favoritas por categoria.
     * @param idCliente cliente que se desea acceder.
     * @param idCategoria categoria que se desea acceder y obtener.
     * @return listado de peliculas por cada categoria.
     */
    public static String obtenerListadoPeliculasEnCategoriaFavoritismo (int idCliente, int idCategoria)
    {
        String peliculasListado = " " + cloneCategorias[idCategoria] +": ";
        int idFavorita;
        for(idFavorita=1; idFavorita<= maxFavoritas; idFavorita++)
        {
            peliculasListado += registroPeliculas(idCliente, idCategoria, idFavorita);
        }
        peliculasListado+= "\n";
        return peliculasListado;
    }
    /**
     * Metodo que obtiene el listado de peliculas por categoria con el que luego pregunta la favorita por cada cliente.
     * @param idCliente cliente que se desea obtener.
     * @param idCategoria categoria que se desea obtener.
     * @param idFavorita numero de la posicion en la que se seleccionó la pelicula favorita.
     * @return listado con el cliente y las peliculas por categoria.
     */
    public static String obtenerListadoNumeroFavorita (int idCliente, int idCategoria, int idFavorita)
    {
        String pregunta;
        pregunta= (cloneClientes[idCliente] + "\n ¿Cuál es su favorita? - Categoria " + cloneCategorias[(idCategoria)] + " " + idFavorita + " de " + maxFavoritas +  "\n\n" + obtenerListadoPeliculasEnCategoria(idCategoria) + "\n\n 0.Ninguna");
        return pregunta;
    }
    /**
     * Método que determina el favoritismo y afinidad de cada uno de los clientes.
     */
    public static void contarFavoritismoPeliculas()
    {
        String mensaje = "LISTADO DE AFINIDAD POR CLIENTE \n\n";
        int favoritismo, cliente1, cliente2, idCategoria, idFavorita;
        
        for(cliente1 = 0; cliente1 < maxClientes; cliente1++)
        {
            mensaje += (cliente1 + 1) + ". " + cloneClientes[cliente1] + " [ ";
            
            for(cliente2 = 0; cliente2 < maxClientes; cliente2++)
            {
                if(cliente1 != cliente2)
                {
                    favoritismo = 0;
                    if(!sexoCliente[indiceClientes[cliente1]].equalsIgnoreCase(
                            sexoCliente[indiceClientes[cliente2]]))
                    {
                        favoritismo++;
                    }
                    mensaje += cloneClientes[cliente2] + " ( ";
                    
                    for(idCategoria = 0; idCategoria < maxCategorias; idCategoria++)
                    {
                        for(idFavorita=1; idFavorita<= maxFavoritas; idFavorita++)
                        {
                            if(obtenerPeliculaFavoritaCliente(idCategoria, cliente1, idFavorita) == obtenerPeliculaFavoritaCliente(idCategoria, cliente2, idFavorita))
                            {
                                favoritismo++;
                            }
                        }
                    }
                    mensaje += favoritismo + " ) ";
                }
            }
            mensaje += " ] \n";
        }
        imprimir(mensaje);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Metodo que asigna datos y valores en las variables e imprime.
     */
    public static void llenarDatosPrueba()
    {
        maxCategorias=3; maxClientes=5; maxPeliculas=10; maxCategoriaPelicula = 2;
        categorias= new String [maxCategorias]; clientes= new String [maxClientes]; peliculas= new String [maxPeliculas]; sexoCliente= new String [maxClientes]; asignarCategoriaPelicula = new int [(maxPeliculas*maxCategoriaPelicula)+maxPeliculas];
        categorias[0]="Accion"; categorias[1]="Ficcion"; categorias[2]="Infantil";
        clientes[0]="Laura"; clientes[1]="Juan"; clientes[2]="Rodrigo"; clientes[3]="Estiven"; clientes[4]="Ximena";
        sexoCliente[0]="f"; sexoCliente[1]="m"; sexoCliente[2]="m"; sexoCliente[3]="m"; sexoCliente[4]="f";
        peliculas[0]="El Robo Perfecto"; peliculas[1]="Gamer"; peliculas[2]="Harry Potter"; peliculas[3]="Mi Villano Favorito"; peliculas[4]="Pantera Negra"; 
        peliculas[5]="Peter Rabbit"; peliculas[6]="Rio 2"; peliculas[7]="Secuestro 2"; peliculas[8]="Star Trek"; peliculas[9]="Tomb Raider";
        asignarCategoriaPelicula[1]= 0; asignarCategoriaPelicula[2]= 0; asignarCategoriaPelicula[3]= 1; asignarCategoriaPelicula[4]= 2; asignarCategoriaPelicula[5]= 0; asignarCategoriaPelicula[6]= 2; asignarCategoriaPelicula[7]= 2; asignarCategoriaPelicula[8]= 0; asignarCategoriaPelicula[9]= 0; asignarCategoriaPelicula[10]= 0;
        asignarCategoriaPelicula[(2+maxPeliculas)+(0-1)]= -1; asignarCategoriaPelicula[(2+maxPeliculas)+(1-1)]= -1; asignarCategoriaPelicula[(2+maxPeliculas)+(2-1)]= -1; asignarCategoriaPelicula[(2+maxPeliculas)+(3-1)]= -1; asignarCategoriaPelicula[(2+maxPeliculas)+(4-1)]= 1; asignarCategoriaPelicula[(2+maxPeliculas)+(5-1)]= -1; asignarCategoriaPelicula[(2+maxPeliculas)+(6-1)]= -1; asignarCategoriaPelicula[(2+maxPeliculas)+(7-1)]= -1; asignarCategoriaPelicula[(2+maxPeliculas)+(8-1)]= 1; asignarCategoriaPelicula[(2+maxPeliculas)+(9-1)]= -1;
        cloneCategorias=categorias.clone(); cloneClientes=clientes.clone(); clonePeliculas=peliculas.clone();
        ordenar(cloneCategorias); ordenar(cloneClientes); ordenar(clonePeliculas);
        indiceCategorias=ordenarObtenerIndice(categorias); indiceClientes=ordenarObtenerIndice(clientes); indicePeliculas=ordenarObtenerIndice(peliculas);
        
        imprimir(obtenerListadoCategorias());
        imprimir(obtenerListadoClientes());
        imprimir(obtenerListadoClientesPorSexo());
        imprimir(obtenerListadoCategoriasPorPeliculas());
        imprimir(obtenerListadoPeliculaPorCategorias());
    }
    /**
     * Método que permite leer los sexos, sólo "F" o "M"  .  
     * @param P pregunta la cuál se le hizó al usuario.
     * @return Cadena ingresada por el usuario.
     */
    public static String leerSexo (String P)
    {
        String x="";
        do
        {
            x=leerCadena(P);
            if( !(x.equalsIgnoreCase("m")) && !(x.equalsIgnoreCase("f")))
            {
                imprimir ("Ingrese uno de los dos posibles caracteres indicados.");
            }
        } while( !(x.equalsIgnoreCase("m")) && !(x.equalsIgnoreCase("f")));
        return x;
    }
    /**
     * Método que lee una cadena de caracteres.
     * @param p Pregunta la cuál se le hizó al usuario.
     * @return La cadena ingresada por el usuario.
     */
    public static String leerCadena (String p)
    {
        return (String) JOptionPane.showInputDialog(null, p, "Registro de datos", 0, iconNetflix02, null, null);
    }
    /**
     * Método que lee una cadena y la convierte en enteros.
     * @param p  Pregunta que se le debe hacer al usuario para leer la cadena.
     * @return entero ingresado por el usuario.
     */
    public static int leerEntero (String p)
    {
        int n;
        boolean esCorrecto;
        n = 0;
        do
        {
            esCorrecto=true;
            try
            {
                n=Integer.parseInt((String) JOptionPane.showInputDialog(null, p, "Registro de datos", 0, iconNetflix02, null, null));
            }
            catch (NumberFormatException e)
            {
                imprimir ( "Ingrese un numero entero");
                esCorrecto=false;
            }
        } while (esCorrecto==false);
        return n;
    }
    /**
     * Método que permite leer un número dentro de un rango.
     * @param p Pregunta la cuál se le hizó al usuario.
     * @param minimo número minimo permitida.
     * @param maximo número maximo permitido.
     * @return entero ingresado por el usuario.
     */
    public static int leerEnteroRango (String p, int minimo, int maximo)
    {
        int c;
        do 
        {
            c =leerEntero(p);
            if ( c<minimo || c > maximo)
            {
                imprimir ("Ingrese un numero valido.");
            }
        }while ( c <minimo || c>maximo);
        return c;
    }
    /**
     * Método que lee caracteres de una determinada cadena de caracteres.
     * @param p  Pregunta que se le debe hacer al usuario para leer un caracter.
     * @return Caracter que el usuario ingresa pero siempre en minúsculas.
     */
    public static char leerCaracter (String p)
    {
        String x;
        do
        {
            x = leerCadena( p ).toLowerCase();
        } while ( x.length() > 1);
        return x.charAt(0);
    }
    /**
     * Método que imprime un texto en pantalla.
     * @param texto  que se desea imprimir.
     */
    public static void imprimir (String texto)
    {
        JOptionPane.showMessageDialog(null,texto,"Listado",JOptionPane.WARNING_MESSAGE,iconNetflix);
    }
    /**
     * Metodo que imprime una secuencia de textos de una referencia completa de determinado arreglo en pantalla.
     * @param a variable con la referencia al arreglo.
     */
    public static void imprimirArreglo (int[] a)
    {
        int i;
        String s;
        s= "";
        for(i = 0; i < a.length; i++)
        {
            s += a[i] + "\n";
        }
        imprimir(s);
    }
    /**
     * Metodo que ordena alfabeticamente un arreglo.
     * @param arreglo variable con la referencia al arreglo.
     */
    public static void ordenar(String[] arreglo)
    {
        String aux;
        int i, j;
        for(i = 0; i < arreglo.length - 1 ; i++ )
        {
            for( j = i+1; j < arreglo.length; j++)
            {
                if (arreglo[i].compareToIgnoreCase( arreglo[j] ) > 0)
                {
                    aux = arreglo[i];
                    arreglo[i]= arreglo[j];
                    arreglo[j]= aux;
                }
            }
        }
    }
    /**
     * Metodo que ordena alfabeticamente un arreglo y retorna su indice en enteros referenciando un arreglo instanciado.
     * @param arreglo variable con la referencia al arreglo.
     * @return variable indice del arreglo ordenado en enteros.
     */
    public static int[] ordenarObtenerIndice(String[] arreglo)
    {
        int i, j, aux;
        int [] indice = new int [arreglo.length];
        for(i = 0; i < arreglo.length ; i++ )
        {
            indice[i]= i;
        }
        for(i = 0; i < arreglo.length - 1 ; i++ )
        {
            for( j = i+1; j < arreglo.length; j++)
            {
                if (arreglo[indice[i]].compareToIgnoreCase( arreglo[indice[j]] ) > 0)
                {
                    aux = indice[i];
                    indice[i]= indice[j];
                    indice[j]= aux;
                }
            }
        }
        return indice;
    }
    /**
     * metodo que ordena un arreglo segun un indice indicado.
     * @param arreglo variable que referencia el arreglo que se desea ordenar.
     * @param indice variable que referencia un arreglo con el indice indicado.
     */
    public static void ordenarAsignarIndice(String[] arreglo, int[] indice)
    {
        int i, j;
        String aux;
        String[] arregloOrdenado = new String [arreglo.length];
        for(i = 0; i < arreglo.length ; i++ )
        {
            arregloOrdenado[i]= arreglo[indice[i]];
        }
        for(i = 0; i < arreglo.length ; i++ )
        {
            arreglo[i]= arregloOrdenado[i];
        }
    }
}
//EL FIN.