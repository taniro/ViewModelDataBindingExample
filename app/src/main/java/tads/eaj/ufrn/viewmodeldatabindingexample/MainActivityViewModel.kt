package tads.eaj.ufrn.viewmodeldatabindingexample

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var _cont = MutableLiveData<Int>(0)
    var cont:LiveData<Int> = _cont

    private var _texto = MutableLiveData<String>("")
    var texto:LiveData<String> = _texto

    private var _urlImage = MutableLiveData<String>("http://tads.eaj.ufrn.br/projects/tads.png")
    var urlImage:LiveData<String> = _urlImage

    fun incrementa(){
        _cont.value = _cont.value!!.plus(1)
    }

    fun afterTextChanged(editable: Editable?){
        _texto.value = editable.toString()
    }




    /*
    var pessoa = MutableLiveData<Pessoa>()

    init {
        pessoa.value = Pessoa("taniro", 35)
    }

     */
}