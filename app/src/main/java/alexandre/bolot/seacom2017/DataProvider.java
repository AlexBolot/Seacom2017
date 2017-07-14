package alexandre.bolot.seacom2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/*................................................................................................................................
 . Copyright (c)
 .
 . The DataProvider	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 14/07/17 02:49
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class DataProvider
{
    public static HashMap<String, List<String>> getExtendedListViewData ()
    {
        LinkedHashMap<String, List<String>> moviesDetails = new LinkedHashMap<>();
        
        List<String> events3107 = new ArrayList<>();
        events3107.add("19h00 : 21h00 — Mesa redonda\nDiscussão sobre “Semiótica”");
        events3107.add("21h00 : 21h30 — Coffe-Break");
        
        List<String> events0108 = new ArrayList<>();
        events0108.add("19h00 : 21h00 — Mesa redonda\nDiscussão sobre “Comunicação, Imaginário e Amazônia”");
        events0108.add("21h00 : 22h30 — Mesa redonda\nDiscussão sobre “Comunicação, Literatura e Gênero”");
        
        List<String> events0208 = new ArrayList<>();
        events0208.add("21h00 - Mesa redonda\nTema: “A comunicação digital e os novos modelos de trabalho”");
        events0208.add("19h00 - Abertura e Palestra");
        events0208.add("21h00 - Encerramento e Coffe-Break");
        
        List<String> events0308 = new ArrayList<>();
        events0308.add("08h00 : 11h00 — Minicurso\n“TelejornalismoConvergente”");
        events0308.add("08h00 : 12h00 — Minicurso\n“Quero ser um videomaker, e agora”");
        events0308.add("08h00 : 12h00 — Minicurso\n“Ciberjornalismo: escrever para internet”");
        events0308.add("14h00 : 17h00 — Minicurso\n“Produção de podcasts”");
        events0308.add("14h00 : 18h00 — Minicurso\n“Criando uma epresa de sucesso”");
        events0308.add("14h00 : 18h00 — Minicurso\n“Fact-checking: como checar o discurso público e combater notícias falsas”");
        events0308.add("19h00 — Aoresebtação acadêmicos e científicos”");
        
        List<String> events0408 = new ArrayList<>();
        events0408.add("08h00 : 11h00 — Minicurso\n“Introdução a roteiro de cinema”");
        events0408.add("08h00 : 12h00 — Minicurso\n“Telejornalismo e a realidade acreana”");
        events0408.add("14h00 : 16h00 — Minicurso\n“No topo das buscas: como aparecer na primeira página do Google”");
        events0408.add("14h00 : 16h00 — Minicurso\n“Fotojornalista: uma profissão em extinção”");
        events0408.add("18h00 — Mesa redonda\n“O empreendedorismo e a comunicação” com a presença de Rodrigo Pires, Késia Façanha e Veriana Ribeiro");
        events0408.add("19h30 — Palestra");
        events0408.add("21h00 — Premiação dos Trabalhos Acadêmicos e Prêmio Alcântara de Fotographia");
        
        moviesDetails.put("31 de Julho", events3107);
        moviesDetails.put("01 de Agosto", events0108);
        moviesDetails.put("02 de Agosto", events0208);
        moviesDetails.put("03 de Agosto", events0308);
        moviesDetails.put("04 de Agosto", events0408);
        
        return moviesDetails;
    }
}
