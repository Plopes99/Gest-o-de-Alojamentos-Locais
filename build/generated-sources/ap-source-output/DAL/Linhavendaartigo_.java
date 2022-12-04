package DAL;

import DAL.Artigo;
import DAL.Venda;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Linhavendaartigo.class)
public class Linhavendaartigo_ { 

    public static volatile SingularAttribute<Linhavendaartigo, Venda> idvenda;
    public static volatile SingularAttribute<Linhavendaartigo, Artigo> idartigo;
    public static volatile SingularAttribute<Linhavendaartigo, BigDecimal> idlva;
    public static volatile SingularAttribute<Linhavendaartigo, BigInteger> quantidade;

}