package DAL;

import DAL.Animal;
import DAL.Venda;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Animal> animalList;
    public static volatile SingularAttribute<Cliente, String> contacto;
    public static volatile ListAttribute<Cliente, Venda> vendaList;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, String> nif;
    public static volatile SingularAttribute<Cliente, BigDecimal> idcliente;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile SingularAttribute<Cliente, String> morada;

}