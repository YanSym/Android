package br.com.caelum.cadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.caelum.cadastro.br.com.caelum.cadastro.dao.AlunoDAO;
import br.com.caelum.cadastro.br.com.caelum.cadastro.modelo.Aluno;

public class FormularioActivity extends AppCompatActivity {

    private FormularioHelper helper;
    public static final	String	ALUNO_SELECIONADO	=	"alunoSelecionado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        this.helper = new FormularioHelper(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public	boolean	onOptionsItemSelected(MenuItem item) {
        switch	(item.getItemId())	{
            case R.id.menu_formulario_ok:
                    AlunoDAO dao = new AlunoDAO(this);
                    Aluno aluno = helper.pegaAlunoDoFormulario();
                    if	(aluno.getId()	==	null)
                    {
                        dao.insere(aluno);
                    }
                    else
                    {
                        dao.altera(aluno);
                    }
                    dao.close();
                    finish();
                    return false;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }
}

