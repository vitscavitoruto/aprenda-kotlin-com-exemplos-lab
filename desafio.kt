// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario (val nome: String)


data class ConteudoEducacional(val nome: String)

data class Formacao(val nome: String, val nivel: Nivel,
 var conteudos: List<ConteudoEducacional>) {

    val inscritos : MutableList<String> = mutableListOf()
    ) {
    
    fun matricular(usuario: Usuario) {
        if (inscritos.contains(usuario.nome)) {
            println(" ${usuario.nome} já está inscrito em $nome")
        } else {
            inscritos.add(usuario.nome)
            println(" ${usuario.nome} foi matriculado em $nome")
        }
    }
    
    fun listarInscritos() {
        println("\n Inscritos em'$nome' : ")
        inscritos.forEach {println(" • $it")}
    }
}
 

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    //usuários
      val victor = Usuario("Victor")
    val eliane = Usuario("Eliane")
    val maria = Usuario("Maria Lina")
    val rubens = Usuario("Rubens")
   
    //Variáveis com formações
    val PHP  = Formacao (
        nome = "PHP-DIO"
        nível = Nível.BASICO
        inscritos = mutableListOf("Rubens, Maria Lina")
        
    )
    val Mobile Developer Cognizant = Formacao (
        nome = Mobile Developer Cognizant
        nível = Nível.INTERMEDIARIO
        inscritos = mutableListOf ("Victor, Eliane")
    ) 
    php.listarInscritos()
    mobileDeveloperCognizant.listarInscritos()
    
    
 }