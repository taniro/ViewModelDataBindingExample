package tads.eaj.ufrn.viewmodeldatabindingexample

data class Pessoa(var nome:String, var idade:Int) {

    fun saynomeeidade():String{
        return "$nome $idade"
    }
}