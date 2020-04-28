<!DOCTYPE HTML>
<html>
<head>
        <title>Les carburants et leurs problèmes</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.0/css/bulma.min.css">
        <link href="squelette3.css" rel="stylesheet" />
</head>

<body>
  <header>
  <nav class="navbar" role="navigation" aria-label="main navigation">
  <div class="navbar-brand">
    <a class="navbar-item" href="https://www.fioulmarket.fr/">
      <img src="logo_pompe_essence.png" width="32" height="auto">
    </a>

    <a role="button" class="navbar-burger burger " aria-label="menu" aria-expanded="false" data-target="navbarBasicExample">
      <span aria-hidden="true"></span>
      <span aria-hidden="true"></span>
      <span aria-hidden="true"></span>
    </a>
  </div>
  

  <div id="navbarBasicExample" class="navbar-menu" >
    <div class="navbar-start">
      <a class="navbar-item" href="squelette.php">
        Accueil
      </a>
    </div>

      <div class="navbar-menu">
      <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          <h3>Actus sur le fioul</h3>
        </a>
        
        <div class="navbar-dropdown">
          <a class="navbar-item">
            <h4>Impact<br>géopolitique</h4>
          </a>
          <a class="navbar-item">
            <h4>Environemment</h4>
          </a>
        </div>
      </div>

      <div class="navbar-menu">
        <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          <h3>Prix du fioul</h3>
        </a>
        
        <div class="navbar-dropdown">
        <a class="navbar-item">
            <h4>Comparaison<br>des prix du<br>fioul</h4>
          </a>
          <a class="navbar-item">
            <h4>Économie</h4>
          </a>
          <a class="navbar-item">
            <h4>Droit</h4>
          </a>
        </div>
      </div>

      <div class="navbar-menu">
        <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          <h3>Acheter du fioul</h3>
        </a>
        
        <div class="navbar-dropdown">
          <a class="navbar-item">
            <h4>Sous menu 1</h4>
          </a>
          <a class="navbar-item">
            <h4>Sous menu 2</h4>
          </a>
        </div>
      </div>

      <div class="navbar-menu">
        <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          <h3>Menu 4</h3>
        </a>
        
        <div class="navbar-dropdown">
          <a class="navbar-item">
            <h4>Sous menu 1</h4>
          </a>
          <a class="navbar-item">
            <h4>Sous menu 2</h4>
          </a>
        </div>
      </div>

      <div class="navbar-menu">
        <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          <h3>Menu 5</h3>
        </a>
        <div class="navbar-dropdown">
          <a class="navbar-item">
            <h4>Sous menu 1</h4>
          </a>
          <a class="navbar-item">
            <h4>Sous menu 2</h4>
          </a>
        </div>
      </div>



      <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          Plus
        </a>

        <div class="navbar-dropdown">
          <a class="navbar-item">
            Nous contacter
          </a>
          <a class="navbar-item">
            pastèque
          </a>
          <a class="navbar-item">
            lardon
          </a>
          <hr class="navbar-divider">
          <a class="navbar-item">
            Remerciements
          </a>
        </div>
      </div>
    </div>
  </div>
    <div class="navbar-end">
      
    </div>
  
  <script type="text/javascript">
  document.addEventListener('DOMContentLoaded', () => {

    // Get all "navbar-burger" elements
    const $navbarBurgers = Array.prototype.slice.call(document.querySelectorAll('.navbar-burger'), 0);

    // Check if there are any navbar burgers
    if ($navbarBurgers.length > 0) {

      // Add a click event on each of them
      $navbarBurgers.forEach( el => {
        el.addEventListener('click', () => {

          // Get the target from the "data-target" attribute
          const target = el.dataset.target;
          const $target = document.getElementById(target);

          // Toggle the "is-active" class on both the "navbar-burger" and the "navbar-menu"
          el.classList.toggle('is-active');
          $target.classList.toggle('is-active');

        });
      });
    }
  });
</script>

</nav>
  </header>
  <h1>Titre principal</h1>
  <main>
    <p>Ceci est un paragraphe</p>
    <p>Ceci est un autre paragraphe</p>
    <p>Ceci est encore un autre paragraphe</p>
  </main>
  <footer>
    <p>À propos</p>
    <p>Nous contacter</p>
  </footer>
</body>
</html>
