@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_album);
    
    Toolbar toolbar;
    toolbar = findViewById(R.id.toolbar);
    // Adiciona Top App Bar
    setSupportActionBar(toolbar);
    // Habilita botão de navegação
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    
    // Ação do botão de navegação
    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // ao pressionar o botão de navegação...
        }
    });
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate Menu
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.top_app_bar, menu);
    return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {

    // Ações do menu
    switch (item.getItemId()) {
    
        case R.id.favorite:
            // ao pressionar o ícone favoritos ...
            return true;

        case R.id.search:
            // ao pressionar o ícone loczaliar ...
            return true;
            
        case R.id.more:
            // ao pressionar o ícone mais opções ...
            return true;

        default:
            // Se a ação não foi reconhecida
            return super.onOptionsItemSelected(item);
    }
}
