package com.thiagottp.lgpd

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*


class MainActivity : DebugActivity() {

    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        campoImagem.setImageResource(R.drawable.capa)

        botaoEntrar.setOnClickListener {
            val valorUsuario = campoUsuario.text.toString()
            val valorSenha = campoSenha.text.toString()
            //Toast.makeText(this, "Fazendo Login...", Toast.LENGTH_LONG).show()

            var intent = Intent(this, TelaInicialActivity::class.java)
            var params = Bundle()

            intent.putExtra("nome_usuario", valorUsuario)
            startActivity(intent)
        }

    }
}