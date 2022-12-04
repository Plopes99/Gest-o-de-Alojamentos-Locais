package DAL;

import DAL.Cliente;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Animal.class)
public class Animal_ { 

    public static volatile SingularAttribute<Animal, String> especie;
    public static volatile SingularAttribute<Animal, BigInteger> numchip;
    public static volatile SingularAttribute<Animal, BigDecimal> idanimal;
    public static volatile SingularAttribute<Animal, String> raca;
    public static volatile SingularAttribute<Animal, String> nome;
    public static volatile SingularAttribute<Animal, Cliente> idcliente;

}