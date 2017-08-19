package br.com.caelum.cadastro;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.caelum.cadastro.br.com.caelum.cadastro.modelo.Aluno;


public class FormularioHelper {
    private Aluno aluno;
    private	EditText	nome;
    private	EditText	telefone;
    private	EditText	site;
    private	RatingBar	nota;
    private	EditText	endereco;
    public	FormularioHelper(FormularioActivity	activity) {
        this.aluno	=	new	Aluno();
        this.nome	=	(EditText)	activity.findViewById(R.id.formulario_nome);
        this.telefone	=	(EditText)	activity.findViewById(R.id.formulario_telefone);
        this.site	=	(EditText)	activity.findViewById(R.id.formulario_site);
        this.nota	=	(RatingBar)	activity.findViewById(R.id.ratingBar);
        this.endereco	=	(EditText)	activity.findViewById(R.id.formulario_endereco);
    }

    public	Aluno	pegaAlunoDoFormulario() {
        aluno.setNome(nome.getText().toString());
        aluno.setEndereco(endereco.getText().toString());
        aluno.setSite(site.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        aluno.setNota(Double.valueOf(nota.getProgress()));
        return	aluno;
    }

    public	void	colocaNoFormulario(Aluno aluno) {
        nome.setText(aluno.getNome());
        nota.setProgress(aluno.getNota().intValue());
        telefone.setText(aluno.getTelefone());
        endereco.setText(aluno.getEndereco());
        site.setText(aluno.getSite());

        this.aluno	=	aluno;
    }

    public boolean validarCampos(FormularioActivity	activity){
        if (activity.findViewById(R.id.formulario_nome).toString().isEmpty()){
            return false;
        }
        return true;
    }

    public void mostrarNome (){
        nome.setError("Campo vazio!");
    }
}
