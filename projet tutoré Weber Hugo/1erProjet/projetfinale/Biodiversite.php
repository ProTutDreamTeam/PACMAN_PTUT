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
          <h3>Environemment</h3>
        </a>

        <div class="navbar-dropdown">
          <a class="navbar-item" href="ImpSante.php">
            <h4>Impacts sur la santé</h4>
          </a>
          <a class="navbar-item" href="ImpEnv.php">
            <h4>Impacts sur l'environnement</h4>
          </a>
          <a class="navbar-item" href="Biodiversite.php">
            <h4>Destruction de la biodiversité</h4>
          </a>
        </div>
      </div>

      <div class="navbar-menu">
        <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link" href="Alternatives.php">
          <h3>Alternatives</h3>
        </a>
        <div class="navbar-dropdown">
          <a class="navbar-item" href="biocarburant.php">
            <h4>Le biocarburant</h4>
          </a>
          <a class="navbar-item" href="dihydrogene.php">
            <h4>Le dihydrogène</h4>
          </a>
          <a class="navbar-item" href="autre.php">
            <h4>Réduction des moyens de transport</h4>
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
  <h1>Carburants et Environemment</h1>
  <main>
    <p>La production et l’exploitation des différents carburants fonctionnant à l’énergie fossile sont l’une des industries les plus développées du monde. Pourtant cette industrie a des effets catastrophiques sur l’environnement provoquant parfois la destruction complète de la biodiversité d’une région. Or cette destruction de la biodiversité à différents effets à long terme, tous ayant un impact très négatif sur l’environnement, et la plupart résulte de l’extraction des énergies fossiles telle que le charbon, le pétrole ou encore les gaz naturels. On peut prendre alors l’exemple de l’exploitation des sables bitumineux d’Athabasca au Canada, exploitation déjà très médiatisé. Ce simple forage visant à trouver du pétrole à entraîner la disparition des peuples autochtones de la région, la libération d’émanations de CO2 dans l’air est la destruction de l’environnement de la région. Ce genre d’incident est très répandus dans le monde et ne va malheureusement pas diminuer tant que l’humanité sera dépendante de ces carburants. Cette destruction touche également le milieu maritime avec le transport de marchandises par pétrolier. Ces bateaux conçus spécialement pour le transport de pétrole et de substance dérivé, provoquent de grave désastre écologique quand ils s’échouent. En effet l’une des principales causes de la destruction de la biodiversité marines est la marée noire. Cette catastrophe est souvent provoquée lors du naufrage d’un pétrolier ou d’une fuite à une station de forage. Le pétrole se déverse alors dans l’océan causant des dommages écologiques catastrophiques, telle que la mort de plusieurs centaines d'organismes vivants.
    </p>
    </main>
  <footer>
    <p>À propos</p>
    <p>Nous contacter</p>
  </footer>
</body>
</html>
