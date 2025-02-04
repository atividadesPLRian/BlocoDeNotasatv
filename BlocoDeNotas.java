import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BlocoDeNotas
{
    List<Anotacao> anotacoes = new ArrayList<>();


    public Anotacao adicionarAnotacao (String texto)
    {
        if (!verificaSeJaExisteNaListaViaTexto(texto))
        {
            int id = anotacoes.size() + 1;
            Anotacao novaAnotacao = new Anotacao(id, texto);
            anotacoes.add(novaAnotacao);
            return novaAnotacao;
        }

        return null;
    }

    public Anotacao editarAnotacao(int id, String texto)
    {
        if (verificaSeJaExisteNaLista(id))
        {
            for (Anotacao anotacao : anotacoes)
            {
                if (anotacao.getId() == id && !anotacao.getDeletado())
                {
                    anotacao.setTexto(texto);
                    return anotacao;
                }
            }
        }
        return null;
    }

    public Anotacao buscaAnotacao(int id)
    {
        if(verificaSeJaExisteNaLista(id))
        {
            for(Anotacao anotacao: anotacoes)
            {
                if(anotacao.getId() == id && !anotacao.getDeletado())
                {
                    return anotacao;
                }
            }
        }
        return null;
    }

    public List<Anotacao> recuperaTexto(String texto)
    {
        List<Anotacao> anotacoesQueContemOTexto = new ArrayList<>();
        for(Anotacao anotacao : anotacoes)
        {
            if(anotacao.contemTexto(texto) && !anotacao.getDeletado())
            {
                anotacoesQueContemOTexto.add(anotacao);
            }
        }
        return anotacoesQueContemOTexto;
    }

    public List<Anotacao> listar()
    {
        List<Anotacao> listaAnotacoesNaoDeletadas = new ArrayList<>();
        for(Anotacao anotacao : anotacoes)
        {
            if(!anotacao.getDeletado())
            {
                listaAnotacoesNaoDeletadas.add(anotacao);
            }
        }
        return listaAnotacoesNaoDeletadas;
    }

    public void deletaAnotacao (int id)
    {
        if(verificaSeJaExisteNaLista(id))
        {
            for(Anotacao anotacao: anotacoes)
            {
                if(anotacao.getId() == id && !anotacao.getDeletado())
                {
                    anotacao.setDeletado();
                }
            }
        }
    }



    private boolean verificaSeJaExisteNaLista(int id)
    {

        for (Anotacao anotacao : anotacoes)
        {
            if (anotacao.getId() == id)
            {
                return true;
            }
        }
        return false;
    }

    private boolean verificaSeJaExisteNaListaViaTexto(String texto)
    {

        for (Anotacao anotacao : anotacoes)
        {
            if (anotacao.getTexto().equals(texto))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlocoDeNotas that = (BlocoDeNotas) o;
        return Objects.equals(anotacoes, that.anotacoes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(anotacoes);
    }
}