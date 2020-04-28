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
        <a class="navbar-link" href="Environemment.php">
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
    <p>L’une alternatives les moins utilisées est pourtant la plus simple, à savoir la non-utilisation de véhicule pour se déplacer. Il est effectivement connus que les personnes habitant près de leurs lieux de travail privilégient la marche à pied ou encore l’utilisation de vélo. Privilégiez ces modes de transport basique est un moyen efficace de lutter contre la pollution de l’air, d'autant plus que tout le monde sait faire du vélo ou marcher. Une autre habitude à mettre en valeur serait l’utilisation de transport en commun tel que le bus ou le train. Ces véhicules bien que polluants permettant le déplacement de plusieurs dizaines d'individus en même temps, la pollution engendrée sera donc toujours moins importante que si chacun utilisait son véhicule personnel. Il existe donc bien une alternative permettant à chacun d'effectuer ses déplacements quotidien.
</p>
    </main>
  <footer>
    <p>À propos</p>
    <p>Nous contacter</p>
  </footer>
</body>
</html>
