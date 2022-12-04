package DAL;

import DAL.Venda;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Tipopagamento.class)
public class Tipopagamento_ { 

    public static volatile SingularAttribute<Tipopagamento, BigDecimal> codtipopagamento;
    public static volatile ListAttribute<Tipopagamento, Venda> vendaList;
    public static volatile SingularAttribute<Tipopagamento, String> descricao;

}