/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.porfolioBackEnd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigo
 */
@RestController
public class Controller {
    @GetMapping("/")
    public String hola(){
        return "{\n" +
"  \"imagenDeFondo\": \"/assets/bckgfoto.jpg\",\n" +
"	\"imagenFoto\": \"/assets/foto.jpg\",\n" +
"\n" +
"  \"nombre\": \"Rodrigo Yaltone\",\n" +
"	\"puestoActual\": \"Poner aca redes sociales\",\n" +
"\n" +
"  \"residenciaActual\": \"Buenos Aires (Argentina)\",\n" +
"\n" +
"  \"companiaActual\": {\n" +
"		\"nombre\": \"ENRE\",\n" +
"		\"img\": \"https://es.wikipedia.org/wiki/Ente_Nacional_Regulador_de_la_Electricidad#/media/Archivo:Enre_logo.png\",\n" +
"		\"url\": \"#\"\n" +
"	},\n" +
"\n" +
"	\"institucionEducativa\": {\n" +
"		\"nombre\": \"UNLP\",\n" +
"		\"img\": \"https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg\",\n" +
"		\"url\": \"#\"\n" +
"	},\n" +
"\n" +
"	\"acercaDe\": \"Ingeniero de alma, especialista en alambre y cinta aisladora\",\n" +
"\n" +
"  \"antecedentesLaborales\": [{\n" +
"			\"puesto\": \"Profesional\",\n" +
"			\"compania\": \"ENRE\",\n" +
"			\"img\": \"/assets/enre_logo.png\",\n" +
"			\"mode\": \"Jornada parcial\",\n" +
"			\"inicio\": \"set 2007\",\n" +
"			\"finalizado\": \"actualidad\"\n" +
"		},\n" +
"		{\n" +
"			\"puesto\": \"Supervision de Instrumentacion de Procesos\",\n" +
"			\"compania\": \"ALPAT\",\n" +
"			\"img\": \"/assets/ap.jpeg\",\n" +
"			\"mode\": \"Jornada parcialII\",\n" +
"			\"inicio\": \"dic 2003\",\n" +
"			\"finalizado\": \"dic 2005\"\n" +
"		}\n" +
"	],\n" +
"\n" +
"\n" +
"	\"educacion\": [{\n" +
"			\"institucion\": \"UBA\",\n" +
"			\"titulo\": \"Abogado\",\n" +
"			\"img\": \"https://upload.wikimedia.org/wikipedia/commons/1/14/Logo_de_la_Universidad_de_Buenos_Aires.jpg\",\n" +
"			\"carrera\": \"Abogacia\",\n" +
"			\"inicio\": \"ene 2021\",\n" +
"			\"finalizado\": \"actualidad\",\n" +
"			\"nota\": 0\n" +
"		},\n" +
"		{\n" +
"			\"institucion\": \"UNLP\",\n" +
"			\"titulo\": \"Ingeniero Electrico\",\n" +
"			\"img\": \"https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg\",\n" +
"			\"carrera\": \"Ingenieria Electrica\",\n" +
"			\"inicio\": \"ene 2007\",\n" +
"			\"finalizado\": \"oct 2015\",\n" +
"			\"nota\": 72\n" +
"		},\n" +
"		{\n" +
"			\"institucion\": \"UNLP\",\n" +
"			\"titulo\": \"Ingeniero en Electronica\",\n" +
"			\"img\": \"https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg\",\n" +
"			\"carrera\": \"Ingenieria Electronica\",\n" +
"			\"inicio\": \"ene 1996\",\n" +
"			\"finalizado\": \"oct 2003\",\n" +
"			\"nota\": 78\n" +
"		},\n" +
"		{\n" +
"			\"institucion\": \"EIT Nº6\",\n" +
"			\"titulo\": \"Tecnico en Electronica\",\n" +
"			\"img\": \"https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg\",\n" +
"			\"carrera\": \"Tecnico en electronica\",\n" +
"			\"inicio\": \"mar 1989\",\n" +
"			\"finalizado\": \"dic 1995\",\n" +
"			\"nota\": 86\n" +
"		}\n" +
"	],\n" +
"\n" +
"  \"skills\": [{\n" +
"    \"nombre\":\"Ingles\",\n" +
"    \"tipo\":\"hard\",\n" +
"    \"porcentaje\":85\n" +
"    },\n" +
"    {\n" +
"    \"nombre\":\"Aleman\",\n" +
"    \"tipo\":\"hard\",\n" +
"    \"porcentaje\":45\n" +
"    },\n" +
"    {\n" +
"    \"nombre\":\"Pensamiento Lateral\",\n" +
"    \"tipo\":\"soft\",\n" +
"    \"porcentaje\":90\n" +
"    },\n" +
"    {\n" +
"    \"nombre\":\"Manitas\",\n" +
"    \"tipo\":\"soft\",\n" +
"    \"porcentaje\":90\n" +
"    }\n" +
"  ],\n" +
"\n" +
"  \"proyectosRealizados\": [{\n" +
"    \"nombre\":\"logro1\",\n" +
"    \"descripcion\":\"descripcionlogro1\",\n" +
"    \"fecha\":\"13-7-1999\"\n" +
"    },{\n" +
"    \"nombre\":\"logro2\",\n" +
"    \"descripcion\":\"descripcionlogro2\",\n" +
"    \"fecha\":\"13-7-1990\"\n" +
"    }\n" +
"  ],\n" +
"\n" +
"  \"otrosIntereses\": [{\n" +
"    \"nombre\":\"Tango\",\n" +
"    \"experiencia\":\"7 años\"\n" +
"    },\n" +
"    {\n" +
"    \"nombre\":\"Teatro\",\n" +
"    \"experiencia\":\"11 años\"\n" +
"    }\n" +
"  ]\n" +
"}";
    }
}
