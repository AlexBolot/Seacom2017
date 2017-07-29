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
 . Last Modified : 29/07/17 19:40
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class DataProvider
{
    public static HashMap<String, List<String>> getExtendedListViewData ()
    {
        LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
        
        List<String> events3107 = new ArrayList<>();
        events3107.add("—— Local —— Sala ambiente do curso de Jornalismo, Bloco Walter Félix.");
        events3107.add("19h00 : 21h00 — Mesa redonda —> #mesa1\nDiscussão sobre “Semiótica”");
        events3107.add("21h00 : 21h30 — Coffe-Break");
        
        List<String> events0108 = new ArrayList<>();
        events0108.add("—— Local —— Sala ambiente do curso de Jornalismo, Bloco Walter Félix.");
        events0108.add("19h00 : 21h00 — Mesa redonda —> #mesa2\nDiscussão sobre “Comunicação, Imaginário e Amazônia”");
        events0108.add("21h00 : 22h30 — Mesa redonda —> #mesa3\nDiscussão sobre “Comunicação, Literatura e Gênero”");
        
        List<String> events0208 = new ArrayList<>();
        events0208.add("—— Local —— Centro de Convenções, Sala Pedro Martinello");
        events0208.add("17h30 - Mesa redonda\nTema: “A comunicação digital e os influenciadores digitais” com a participação de Igor Martins do ComIgor Tv, " + "Maykeline Maia  e Elita Maia do Divando Blogger, Lucas do Vale e Wesley Santos do Desacreditados.");
        events0208.add("19h00 - Abertura e Palestra “Comunicação digital e modelos de trabalho”, com a jornalista Taís Seibt");
        events0208.add("21h00 - Encerramento e Coffe-Break");
        
        List<String> events0308 = new ArrayList<>();
        events0308.add("—— Manhã ——");
        events0308.add("08h00 : 11h00 — Minicurso —> #telejornalismo\n“TelejornalismoConvergente”\nLocal: Bloco Walter Felix II, Laboratório de TV");
        events0308.add("08h00 : 12h00 — Minicurso —> #videomaker\n“Quero ser um videomaker, e agora”\nLocal: Bloco Walter Felix II, Sala Ambiente de Jornalismo");
        events0308.add(
                "08h00 : 12h00 — Minicurso —> #ciberjornalismo\n“Ciberjornalismo: escrever para internet”\nLocal: Bloco Walter Felix II, Laboratório de Informática");
        events0308.add("—— Tarde ——");
        events0308.add("14h00 : 17h00 — Minicurso —> #empresa\n“Produção de podcasts”\nLocal: Centro de Convenções, Sala Adriana Santelli");
        events0308.add("14h00 : 18h00 — Minicurso —> #podcasts\n“Criando uma epresa de sucesso”\nLocal: Bloco Walter Felix II, Laboratório de Informática");
        events0308.add(
                "14h00 : 18h00 — Minicurso —> #noticiasfalsas\n“Fact-checking: como checar o discurso público e combater notícias falsas”\nLocal: Bloco Walter Felix, Sala Ambiente de Jornalismo");
        events0308.add("—— Noite ——");
        events0308.add("19h00 — “Aoresebtação acadêmicos e científicos”\nLocal: Bloco Walter Felix II");
        
        List<String> events0408 = new ArrayList<>();
        events0308.add("—— Manhã ——");
        events0408.add("08h00 : 11h00 — Minicurso —> #roteiro\n“Introdução a roteiro de cinema”\nLocal: Centro de Convenções, Sala Adriana Santelli");
        events0408.add(
                "08h00 : 12h00 — Minicurso —> #realidadeacreana\n“Telejornalismo e a realidade acreana”\nLocal: Bloco Walter Felix II, Sala de Telejornalismo");
        events0308.add("—— Tarde ——");
        events0408.add(
                "14h00 : 16h00 — Minicurso —> #google\n“No topo das buscas: como aparecer na primeira página do Google”\nLocal: Bloco Walter Felix II, Sala de Informática");
        events0408.add(
                "14h00 : 16h00 — Minicurso —> #fotojornalismo\n“Fotojornalista: uma profissão em extinção”\nLocal: Centro de Convenções, Sala Adriana Santelli");
        events0308.add("—— Noite ——");
        events0408.add(
                "18h00 — Mesa redonda: “O empreendedorismo e a comunicação” com a presença de Alan Rick, Rodrigo Pires, Veriana Ribeiro e Natan Peres \nLocal: Centro de Convenções, Sala Pedro Martinello\nMediadora: Tatyana Lima");
        events0408.add(
                "19h30 — Palestra “Liberdade de Expressão e Direito à Informação no Ciberespaço: Comunicação Sem Fronteiras no Mundo Conectado”, com o juiz Giordane Dourado. Local: Centro de Convenções, Sala Pedro Martinello");
        events0408.add("21h00 — Premiação dos Trabalhos Acadêmicos e Prêmio Alcântara de Fotografia \nLocal: Centro de Convenções, Área Aberta");
        events0408.add("21h30 — Programação Cultural (Acústico Seacom, com Jonathan Rabelo)");
    
        List<String> coletivoDecor = new ArrayList<>();
        coletivoDecor.add("– Exposição de bonsai e kokedama com Amazônia Bonsai **");
        coletivoDecor.add("– Caricaturas ao vivo com Studio Paulo Tonon **");
        coletivoDecor.add("– Quick massagem com Fernanda Zanatta **");
        coletivoDecor.add("– Cenário pela Sulatina Móveis da Amazônia");
        coletivoDecor.add("——— Dia 03/08, quinta-feira ———");
        coletivoDecor.add("—— Manhã ——");
        coletivoDecor.add("10h00 : 11h30 — Oficina de desenho artístico : da cópia à criação com Paulo Tonon *");
        coletivoDecor.add("—— Tarde ——");
        coletivoDecor.add("17h00 : 18h30 — Oficina de contação de histórias com Luís Eduardo Ferreira ***");
        coletivoDecor.add("——— Dia 04/08, sexta-feira ———");
        coletivoDecor.add("—— Manhã ——");
        coletivoDecor.add("10h00 : 11h30 — Oficina de escrita afetiva com Bruna Guedes **");
        coletivoDecor.add("—— Tarde ——");
        coletivoDecor.add("17h00 : 18h30 – Oficina de expressão em movimento – fluindo no mat pilates com Ana Sansara Caires *");
        coletivoDecor.add("");
        coletivoDecor.add("* Dúvidas e informações com Rafaela Zanatta, o Coletivo Decor (68.9 9950-1850)");
        coletivoDecor.add("** Venda de Produtos e Serviços");
        coletivoDecor.add("*** Oficinas gratuitas, inscrições antecipadas com Vagas Limitadas!");
    
        linkedHashMap.put("31 de Julho", events3107);
        linkedHashMap.put("01 de Agosto", events0108);
        linkedHashMap.put("02 de Agosto", events0208);
        linkedHashMap.put("03 de Agosto", events0308);
        linkedHashMap.put("04 de Agosto", events0408);
        linkedHashMap.put("Coletivo Decor", coletivoDecor);
    
        return linkedHashMap;
    }
}
