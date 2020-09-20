package com.thiagottp.lgpd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class TelaInicialActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val args = intent.extras
        val nome = args?.getString("nome_usuario")
        Toast.makeText(this, "Usuário logado: $nome", Toast.LENGTH_LONG).show()


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId
        if (id== R.id.action_alei){
            Toast.makeText(this, "Conheça a lei", Toast.LENGTH_LONG). show()
        }
        else if (id== R.id.action_alei){
            Toast.makeText(this, "Conheça a lei", Toast.LENGTH_LONG). show()
        }
        else if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)

    }

}