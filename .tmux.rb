
require 'lab42/tmux/auto_import'

def vi base_dir='.', colorscheme: nil, &block
  new_window "vi_#{base_dir}" do
    send_keys "vi #{base_dir}"
    send_keys ":colorscheme #{colorscheme}" if colorscheme
    block.() if block
  end
end

config do
  pre_wait_interval 0.1
  post_wait_interval 0.1
  wait_timeout 4
  verbose true
end
new_session 'SimpleParser ' do
  vi colorscheme: :morning
  vi 'src/main/scala/net/lab419', colorscheme: :molokai
  new_window 'test'
  vi 'src/test/scala/net/lab419', colorscheme: :solarized
  new_window 'sbt' do
    send_keys 'sbt'
  end
  new_window 'chex'
end
