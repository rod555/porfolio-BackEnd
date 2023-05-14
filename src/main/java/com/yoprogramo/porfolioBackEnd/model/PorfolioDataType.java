/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.porfolioBackEnd.model;

/**
 *
 * @author rodrigo
 */
public class PorfolioDataType {
    
    String imagenDeFondo="/assets/bckgfoto.jpg";
    String imagenFoto= "/assets/foto.jpg";
    String nombre= "Rodrigo Yaltone";
    String puestoActual= "Poner aca redes sociales";
    String residenciaActual= "Buenos Aires (Argentina)";
    List<> companiaActual= new List();
"companiaActual": {
		"nombre": "ENRE",
		"img": "https://es.wikipedia.org/wiki/Ente_Nacional_Regulador_de_la_Electricidad#/media/Archivo:Enre_logo.png",
		"url": "#"
	},

     List<> institucionEducativa= new List();
"institucionEducativa": {
		"nombre": "UNLP",
		"img": "https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg",
		"url": "#"
	},
    
    
String acercaDe= "Ingeniero de alma, especialista en alambre y cinta aisladora";

ArrayList antecedentesLaborales= new Arraylist(); [{
			"puesto": "Profesional",
			"compania": "ENRE",
			"img": "/assets/enre_logo.png",
			"mode": "Jornada parcial",
			"inicio": "set 2007",
			"finalizado": "actualidad"
		},
		{
			"puesto": "Supervision de Instrumentacion de Procesos",
			"compania": "ALPAT",
			"img": "/assets/ap.jpeg",
			"mode": "Jornada parcialII",
			"inicio": "dic 2003",
			"finalizado": "dic 2005"
		}
	],


"educacion": [{
			"institucion": "UBA",
			"titulo": "Abogado",
			"img": "https://upload.wikimedia.org/wikipedia/commons/1/14/Logo_de_la_Universidad_de_Buenos_Aires.jpg",
			"carrera": "Abogacia",
			"inicio": "ene 2021",
			"finalizado": "actualidad",
			"nota": 0
		},
		{
			"institucion": "UNLP",
			"titulo": "Ingeniero Electrico",
			"img": "https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg",
			"carrera": "Ingenieria Electrica",
			"inicio": "ene 2007",
			"finalizado": "oct 2015",
			"nota": 72
		},
		{
			"institucion": "UNLP",
			"titulo": "Ingeniero en Electronica",
			"img": "https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg",
			"carrera": "Ingenieria Electronica",
			"inicio": "ene 1996",
			"finalizado": "oct 2003",
			"nota": 78
		},
		{
			"institucion": "EIT Nº6",
			"titulo": "Tecnico en Electronica",
			"img": "https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg",
			"carrera": "Tecnico en electronica",
			"inicio": "mar 1989",
			"finalizado": "dic 1995",
			"nota": 86
		}
	],

"skills": [{
    "nombre":"Ingles",
    "tipo":"hard",
    "porcentaje":85
    },
    {
    "nombre":"Aleman",
    "tipo":"hard",
    "porcentaje":45
    },
    {
    "nombre":"Pensamiento Lateral",
    "tipo":"soft",
    "porcentaje":90
    },
    {
    "nombre":"Manitas",
    "tipo":"soft",
    "porcentaje":90
    }
  ],

"proyectosRealizados": [{
    "nombre":"logro1",
    "descripcion":"descripcionlogro1",
    "fecha":"13-7-1999"
    },{
    "nombre":"logro2",
    "descripcion":"descripcionlogro2",
    "fecha":"13-7-1990"
    }
  ],

    
"otrosIntereses": [{
    "nombre":"Tango",
    "experiencia":"7 años"
    },
    {
    "nombre":"Teatro",
    "experiencia":"11 años"
    }
  ]
}

    
    
    
/* JSON a cumplir
{
  "imagenDeFondo": "/assets/bckgfoto.jpg",
	"imagenFoto": "/assets/foto.jpg",

  "nombre": "Rodrigo Yaltone",
	"puestoActual": "Poner aca redes sociales",

  "residenciaActual": "Buenos Aires (Argentina)",

  "companiaActual": {
		"nombre": "ENRE",
		"img": "https://es.wikipedia.org/wiki/Ente_Nacional_Regulador_de_la_Electricidad#/media/Archivo:Enre_logo.png",
		"url": "#"
	},

	"institucionEducativa": {
		"nombre": "UNLP",
		"img": "https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg",
		"url": "#"
	},

	"acercaDe": "Ingeniero de alma, especialista en alambre y cinta aisladora",

  "antecedentesLaborales": [{
			"puesto": "Profesional",
			"compania": "ENRE",
			"img": "/assets/enre_logo.png",
			"mode": "Jornada parcial",
			"inicio": "set 2007",
			"finalizado": "actualidad"
		},
		{
			"puesto": "Supervision de Instrumentacion de Procesos",
			"compania": "ALPAT",
			"img": "/assets/ap.jpeg",
			"mode": "Jornada parcialII",
			"inicio": "dic 2003",
			"finalizado": "dic 2005"
		}
	],


	"educacion": [{
			"institucion": "UBA",
			"titulo": "Abogado",
			"img": "https://upload.wikimedia.org/wikipedia/commons/1/14/Logo_de_la_Universidad_de_Buenos_Aires.jpg",
			"carrera": "Abogacia",
			"inicio": "ene 2021",
			"finalizado": "actualidad",
			"nota": 0
		},
		{
			"institucion": "UNLP",
			"titulo": "Ingeniero Electrico",
			"img": "https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg",
			"carrera": "Ingenieria Electrica",
			"inicio": "ene 2007",
			"finalizado": "oct 2015",
			"nota": 72
		},
		{
			"institucion": "UNLP",
			"titulo": "Ingeniero en Electronica",
			"img": "https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg",
			"carrera": "Ingenieria Electronica",
			"inicio": "ene 1996",
			"finalizado": "oct 2003",
			"nota": 78
		},
		{
			"institucion": "EIT Nº6",
			"titulo": "Tecnico en Electronica",
			"img": "https://upload.wikimedia.org/wikipedia/commons/7/74/UNLP_Logo_%28cropped%29.svg",
			"carrera": "Tecnico en electronica",
			"inicio": "mar 1989",
			"finalizado": "dic 1995",
			"nota": 86
		}
	],

  "skills": [{
    "nombre":"Ingles",
    "tipo":"hard",
    "porcentaje":85
    },
    {
    "nombre":"Aleman",
    "tipo":"hard",
    "porcentaje":45
    },
    {
    "nombre":"Pensamiento Lateral",
    "tipo":"soft",
    "porcentaje":90
    },
    {
    "nombre":"Manitas",
    "tipo":"soft",
    "porcentaje":90
    }
  ],

  "proyectosRealizados": [{
    "nombre":"logro1",
    "descripcion":"descripcionlogro1",
    "fecha":"13-7-1999"
    },{
    "nombre":"logro2",
    "descripcion":"descripcionlogro2",
    "fecha":"13-7-1990"
    }
  ],

  "otrosIntereses": [{
    "nombre":"Tango",
    "experiencia":"7 años"
    },
    {
    "nombre":"Teatro",
    "experiencia":"11 años"
    }
  ]
}
*/
    
}
