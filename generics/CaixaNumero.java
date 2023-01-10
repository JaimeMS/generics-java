package generics;

/*
 * EXEMPLO DE HERANÇA COM CLASSE GENÉRICA
 * 
 * NESTE EXEMPLO A CLASSE GENÉRICA CaixaNumero DEVE RECEBER UM TIPO
 * E ESSE TIPO DEVE OBRIGATÓRIAMENTE EXTENDER DA CLASSE Number
 */
public class CaixaNumero<N extends Number> extends Caixa<N> {

}
