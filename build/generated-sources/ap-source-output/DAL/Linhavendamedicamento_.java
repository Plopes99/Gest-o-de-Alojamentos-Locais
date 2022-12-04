package DAL;

import DAL.Medicamento;
import DAL.Venda;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Linhavendamedicamento.class)
public class Linhavendamedicamento_ { 

    public static volatile SingularAttribute<Linhavendamedicamento, Venda> idvenda;
    public static volatile SingularAttribute<Linhavendamedicamento, Medicamento> idmedicamento;
    public static volatile SingularAttribute<Linhavendamedicamento, BigInteger> quantidade;
    public static volatile SingularAttribute<Linhavendamedicamento, BigDecimal> idlvm;

}