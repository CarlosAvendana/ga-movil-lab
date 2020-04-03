package ga.cf.ga_cursos_carrera.AccesoDatos;

import java.util.ArrayList;
import java.util.List;

import ga.cf.ga_cursos_carrera.LogicaNeg.Carrera;
import ga.cf.ga_cursos_carrera.LogicaNeg.Curso;
import ga.cf.ga_cursos_carrera.LogicaNeg.Usuario;

public class ModelData {

    private List<Carrera> carreraList;
    private List<Curso> cursoList;


    public ModelData() {
        carreraList = new ArrayList<>();
        cursoList = new ArrayList<>();
        prepareCarreraData();
        prepareCursoData();
    }
    public void prepareCarreraData() {
        Carrera carrera = new Carrera("EIF", "Ingenieria en sistemas");
        carrera.addCurso(new Curso("ST", "Soporte", 3, 4));
        carrera.addCurso(new Curso("FD", "Fundamentos", 3, 4));
        carrera.addCurso(new Curso("PG1", "Programacion I", 3, 4));
        carrera.addCurso(new Curso("PG2", "Programacion II", 3, 4));
        carrera.addCurso(new Curso("PG3", "Programacion III", 3, 4));
        carrera.addCurso(new Curso("PG4", "Programacion IV", 3, 4));
        carrera.addCurso(new Curso("EDA", "Estructuras Datos", 3, 4));
        carrera.addCurso(new Curso("EDI", "Estructuras Discretas", 3, 4));
        carrera.addCurso(new Curso("MV", "Moviles", 3, 4));
        carrera.addCurso(new Curso("PP", "Paradigmas", 3, 4));
        carrera.addCurso(new Curso("AQ", "Arquitectura", 3, 4));
        carrera.addCurso(new Curso("RD", "Redes", 3, 4));
        carreraList.add(carrera);

        carrera = new Carrera("ADM", "Administracion");
        carrera.addCurso(new Curso("FAD", "Fundamentos de Administracion", 3, 4));
        carrera.addCurso(new Curso("C1", "Contabilidad I", 3, 4));
        carreraList.add(carrera);

        carrera = new Carrera("FIS", "Fisica");
        carrera.addCurso(new Curso("FF", "Fundamentos de Fisica", 3, 4));
        carrera.addCurso(new Curso("F1", "Fisica I", 3, 4));
        carreraList.add(carrera);

        carrera = new Carrera("MAT", "Matematica");
        carrera.addCurso(new Curso("FM", "Fundamentos de Matematica", 3, 4));
        carrera.addCurso(new Curso("HB1", "Historia Basica I", 3, 4));
        carreraList.add(carrera);

        carrera = new Carrera("Star Trek", "Science Fiction");
        carrera.addCurso(new Curso("M1", "Matrix 1", 3, 4));
        carrera.addCurso(new Curso("BDR", "Blade Runner 2049", 3, 4));
        carreraList.add(carrera);

        carrera = new Carrera("The LEGO Movie", "Animation");
        carrera.addCurso(new Curso("ZOO", "Zootopia", 3, 4));
        carrera.addCurso(new Curso("VIN", "Vecinos Invasores", 3, 4));
        carreraList.add(carrera);

        carrera = new Carrera("Back to the Future", "Classics");
        carrera.addCurso(new Curso("TIT", "Titanic", 3, 4));
        carrera.addCurso(new Curso("DDA", "Donnie Darko", 3, 4));
        carreraList.add(carrera);

        carrera = new Carrera("3 Idiots", "Commedy");
        carrera.addCurso(new Curso("WDG", "War Dogs", 3, 4));
        carrera.addCurso(new Curso("ANT", "Ant Man", 3, 4));
        carreraList.add(carrera);

        carrera = new Carrera("Guardians of the Galaxy", "Science Fiction & Fantasy");
        carrera.addCurso(new Curso("JL", "Justice League", 3, 4));
        carrera.addCurso(new Curso("AVG", "Avengers", 3, 4));
        carreraList.add(carrera);


        carrera = new Carrera("Batman", "Action");
        carreraList.add(carrera);
    }
    public void prepareCursoData() {
        Curso curso = new Curso("ST", "Soporte", 3, 4);
        cursoList.add(curso);
        curso = new Curso("FD", "Fundamentos", 3, 4);
        cursoList.add(curso);
        curso = new Curso("PG1", "Programacion I", 3, 4);
        cursoList.add(curso);
        curso = new Curso("PG2", "Programacion II", 3, 4);
        cursoList.add(curso);
        curso = new Curso("PG3", "Programacion III", 3, 4);
        cursoList.add(curso);
        curso = new Curso("PG4", "Programacion IV", 3, 4);
        cursoList.add(curso);
        curso = new Curso("EDA", "Estructuras Datos", 3, 4);
        cursoList.add(curso);
        curso = new Curso("EDI", "Estructuras Discretas", 3, 4);
        cursoList.add(curso);

        curso = new Curso("MV", "Moviles", 3, 4);
        cursoList.add(curso);
        curso = new Curso("PP", "Paradigmas", 3, 4);
        cursoList.add(curso);

        curso = new Curso("AQ", "Arquitectura", 3, 4);
        cursoList.add(curso);

        curso = new Curso("RD", "Redes", 3, 4);
        cursoList.add(curso);
        // de adm
        curso = new Curso("FAD", "Fundamentos de Administracion", 3, 4);
        cursoList.add(curso);
        curso = new Curso("C1", "Contabilidad I", 3, 4);
        cursoList.add(curso);
        // de fisica
        curso = new Curso("FF", "Fundamentos de Fisica", 3, 4);
        cursoList.add(curso);
        curso = new Curso("F1", "Fisica I", 3, 4);
        cursoList.add(curso);
        // de matematica
        curso = new Curso("FM", "Fundamentos de Matematica", 3, 4);
        cursoList.add(curso);
        curso = new Curso("HB1", "Historia Basica I", 3, 4);
        cursoList.add(curso);
        // de science fiction
        curso = new Curso("M1", "Matrix 1", 3, 4);
        cursoList.add(curso);
        curso = new Curso("BDR", "Blade Runner 2049", 3, 4);
        cursoList.add(curso);
        // de animation
        curso = new Curso("ZOO", "Zootopia", 3, 4);
        cursoList.add(curso);
        curso = new Curso("VIN", "Vecinos Invasores", 3, 4);
        cursoList.add(curso);
        // de classics
        curso = new Curso("TIT", "Titanic", 3, 4);
        cursoList.add(curso);
        curso = new Curso("DDA", "Donnie Darko", 3, 4);
        cursoList.add(curso);
        // de commedy
        curso = new Curso("WDG", "War Dogs", 3, 4);
        cursoList.add(curso);
        curso = new Curso("ANT", "Ant Man", 3, 4);
        cursoList.add(curso);
        // de Science Fiction & Fantasy
        curso = new Curso("JL", "Justice League", 3, 4);
        cursoList.add(curso);
        curso = new Curso("AVG", "Avengers", 3, 4);
        cursoList.add(curso);
    }
    public List<Carrera> getCarreraList() {
        return carreraList;
    }
    public List<Curso> getCursoList() {
        return cursoList;
    }
    public void setCarreraList(List<Carrera> carreraList) {
        this.carreraList = carreraList;
    }
    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }
    public List<Usuario> getUsuariosList() {
        List<Usuario> users = new ArrayList<>();
        users.add(new Usuario("@admin", "admin", "administrador", "111"));
        users.add(new Usuario("@carlos", "admin", "administrador", "402370159"));
        users.add(new Usuario("@felipe", "admin", "administrador", "402370159"));
        return users;
    }


}
