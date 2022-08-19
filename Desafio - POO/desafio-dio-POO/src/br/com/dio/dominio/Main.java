package br.com.dio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso python");
		curso2.setDescricao("descrição curso python");
		curso2.setCargaHoraria(6);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setDate(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootCamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devGabriel = new Dev();
		devGabriel.setNome("Gabriel");
		devGabriel.inscreverBootCamp(bootcamp);
		System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
		devGabriel.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Gabriel: " + devGabriel.getConteudosConcluidos());
		System.out.println("XP: " + devGabriel.calcularTotalXp());

		System.out.println("--------");

		Dev devArthur = new Dev();
		devArthur.setNome("Arthur");
		devArthur.inscreverBootCamp(bootcamp);
		System.out.println("Conteúdos Inscritos Arthur: " + devArthur.getConteudosInscritos());
		devArthur.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Arthur: " + devArthur.getConteudosInscritos());
		devArthur.progredir();
		System.out.println("Conteúdos Concluídos Arthur: " + devArthur.getConteudosConcluidos());
		System.out.println("XP: " + devArthur.calcularTotalXp());

	}

}
